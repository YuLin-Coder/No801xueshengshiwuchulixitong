package com.dao;

import com.entity.BanjiKechengLaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiKechengLaoshiView;

/**
 * 班级课程老师关系 Dao 接口
 *
 * @author 
 * @since 2021-03-25
 */
public interface BanjiKechengLaoshiDao extends BaseMapper<BanjiKechengLaoshiEntity> {

   List<BanjiKechengLaoshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
