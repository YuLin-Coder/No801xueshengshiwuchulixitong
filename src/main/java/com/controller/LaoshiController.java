package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.LaoshiEntity;

import com.service.LaoshiService;
import com.entity.view.LaoshiView;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 老师
 * 后端接口
 * @author
 * @email
 * @date 2021-03-25
*/
@RestController
@Controller
@RequestMapping("/laoshi")
public class LaoshiController {
    private static final Logger logger = LoggerFactory.getLogger(LaoshiController.class);

    @Autowired
    private LaoshiService laoshiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        PageUtils page = laoshiService.queryPage(params);

        //字典表数据转换
        List<LaoshiView> list =(List<LaoshiView>)page.getList();
        for(LaoshiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LaoshiEntity laoshi = laoshiService.selectById(id);
        if(laoshi !=null){
            //entity转view
            LaoshiView view = new LaoshiView();
            BeanUtils.copyProperties( laoshi , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody LaoshiEntity laoshi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,laoshi:{}",this.getClass().getName(),laoshi.toString());
        Wrapper<LaoshiEntity> queryWrapper = new EntityWrapper<LaoshiEntity>()
            .eq("username", laoshi.getUsername())
            .or()
            .eq("laoshi_id_number", laoshi.getLaoshiIdNumber())
            .or()
            .eq("laoshi_phone", laoshi.getLaoshiPhone());
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LaoshiEntity laoshiEntity = laoshiService.selectOne(queryWrapper);
        if(laoshiEntity==null){
            laoshi.setCreateTime(new Date());
            laoshi.setPassword("123456");
            laoshiService.insert(laoshi);
            return R.ok();
        }else {
            return R.error(511,"老师账户或者手机号或者身份证号已被使用");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LaoshiEntity laoshi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,laoshi:{}",this.getClass().getName(),laoshi.toString());
        //根据字段查询是否有相同数据
        Wrapper<LaoshiEntity> queryWrapper = new EntityWrapper<LaoshiEntity>()
            .notIn("id",laoshi.getId())
            .andNew()
            .eq("username", laoshi.getUsername())
            .or()
            .eq("laoshi_id_number", laoshi.getLaoshiIdNumber())
            .or()
            .eq("laoshi_phone", laoshi.getLaoshiPhone());
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LaoshiEntity laoshiEntity = laoshiService.selectOne(queryWrapper);
        if("".equals(laoshi.getLaoshiPhoto()) || "null".equals(laoshi.getLaoshiPhoto())){
                laoshi.setLaoshiPhoto(null);
        }
        if(laoshiEntity==null){
            laoshiService.updateById(laoshi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"老师账户或者手机号或者身份证号已被使用");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        laoshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 登录
     */
    @IgnoreAuth
    @PostMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        LaoshiEntity laoshi = laoshiService.selectOne(new EntityWrapper<LaoshiEntity>().eq("username", username));
        if(laoshi==null || !laoshi.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        String roleName;
        if("1".equals(String.valueOf(laoshi.getRoleTypes()))){
            roleName="老师";
        }else if("2".equals(String.valueOf(laoshi.getRoleTypes()))){
            roleName="辅导员";
        }else{
            return R.error("权限不正确,请联系管理员");
        }
        String token = tokenService.generateToken(laoshi.getId(),username, "laoshi", roleName);
        R r = R.ok();
        r.put("token", token);
        r.put("role",roleName);
        r.put("username",laoshi.getLaoshiName());
        r.put("tableName","laoshi");
        r.put("userId",laoshi.getId());
        return r;
    }

//    /**
//     * 注册
//     */
//    @IgnoreAuth
//    @PostMapping(value = "/register")
//    public R register(@RequestBody LaoshiEntity yonghu){
//        //    	ValidatorUtils.validateEntity(user);
//        if(yonghuService.selectOne(new EntityWrapper<LaoshiEntity>().eq("username", yonghu.getUsername()).orNew().eq("phone",yonghu.getPhone()).orNew().eq("id_number",yonghu.getIdNumber())) !=null) {
//            return R.error("用户已存在或手机号身份证号已经被使用");
//        }
//        yonghuService.insert(yonghu);
//        return R.ok();
//    }

//    /**
//     * 重置密码
//     */
//    @GetMapping(value = "/resetPassword")
//    public R resetPassword(Integer  yonghuId){
//        YonghuEntity yonghu = new YonghuEntity();
//        yonghu.setPassword("123456");
//        yonghu.setId(yonghuId);
//        yonghuService.updateById(yonghu);
//        return R.ok();
//    }

    /**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrYonghu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        LaoshiEntity laoshi = laoshiService.selectById(id);
        return R.ok().put("data", laoshi);
    }


    /**
     * 退出
     */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }


}

