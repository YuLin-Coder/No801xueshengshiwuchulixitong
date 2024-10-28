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

import com.entity.ChangdishenqingEntity;

import com.service.ChangdishenqingService;
import com.entity.view.ChangdishenqingView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 场地申请
 * 后端接口
 * @author
 * @email
 * @date 2021-03-25
*/
@RestController
@Controller
@RequestMapping("/changdishenqing")
public class ChangdishenqingController {
    private static final Logger logger = LoggerFactory.getLogger(ChangdishenqingController.class);

    @Autowired
    private ChangdishenqingService changdishenqingService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private YonghuService yonghuService;


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
        PageUtils page = changdishenqingService.queryPage(params);

        //字典表数据转换
        List<ChangdishenqingView> list =(List<ChangdishenqingView>)page.getList();
        for(ChangdishenqingView c:list){
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
        ChangdishenqingEntity changdishenqing = changdishenqingService.selectById(id);
        if(changdishenqing !=null){
            //entity转view
            ChangdishenqingView view = new ChangdishenqingView();
            BeanUtils.copyProperties( changdishenqing , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(changdishenqing.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
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
    public R save(@RequestBody ChangdishenqingEntity changdishenqing, HttpServletRequest request) {
        logger.debug("save方法:,,Controller:{},,changdishenqing:{}", this.getClass().getName(), changdishenqing.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if ("用户".equals(role)) {
            Date date = new Date();
            if((changdishenqing.getStartTime().getTime()-date.getTime())<0){
                return R.error(511, "使用时间不能小于当前时间");
            }
            if((changdishenqing.getEndTime().getTime()-changdishenqing.getStartTime().getTime())<0){
                return R.error(511, "结束时间不能小于使用时间");
            }

            changdishenqing.setShenheTypes(3);
            changdishenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            changdishenqing.setCreateTime(date);
            changdishenqingService.insert(changdishenqing);
            return R.ok();
        } else {
            return R.error(511, "您没有权限新增场地申请单");
        }

    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChangdishenqingEntity changdishenqing, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,changdishenqing:{}",this.getClass().getName(),changdishenqing.toString());
        //根据字段查询是否有相同数据
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      changdishenqing.set
            //  }
        changdishenqingService.updateById(changdishenqing);//根据id更新
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        changdishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}

