package com.dao;

import com.entity.QingjiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiashenqingView;

/**
 * 请假申请 Dao 接口
 *
 * @author 
 * @since 2021-03-25
 */
public interface QingjiashenqingDao extends BaseMapper<QingjiashenqingEntity> {

   List<QingjiashenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
