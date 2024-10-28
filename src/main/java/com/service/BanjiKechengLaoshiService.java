package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiKechengLaoshiEntity;
import java.util.Map;

/**
 * 班级课程老师关系 服务类
 * @author 
 * @since 2021-03-25
 */
public interface BanjiKechengLaoshiService extends IService<BanjiKechengLaoshiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}