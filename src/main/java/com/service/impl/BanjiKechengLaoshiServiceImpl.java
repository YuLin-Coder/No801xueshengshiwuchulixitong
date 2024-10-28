package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.BanjiKechengLaoshiDao;
import com.entity.BanjiKechengLaoshiEntity;
import com.service.BanjiKechengLaoshiService;
import com.entity.view.BanjiKechengLaoshiView;

/**
 * 班级课程老师关系 服务实现类
 * @author 
 * @since 2021-03-25
 */
@Service("banjiKechengLaoshiService")
@Transactional
public class BanjiKechengLaoshiServiceImpl extends ServiceImpl<BanjiKechengLaoshiDao, BanjiKechengLaoshiEntity> implements BanjiKechengLaoshiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BanjiKechengLaoshiView> page =new Query<BanjiKechengLaoshiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
