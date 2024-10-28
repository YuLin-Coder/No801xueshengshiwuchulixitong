package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaoshiEntity;
import java.util.Map;

/**
 * 老师 服务类
 * @author 
 * @since 2021-03-25
 */
public interface LaoshiService extends IService<LaoshiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}