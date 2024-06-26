package com.dao;

import com.entity.JuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JuanzengView;

/**
 * 物品捐赠 Dao 接口
 *
 * @author 
 */
public interface JuanzengDao extends BaseMapper<JuanzengEntity> {

   List<JuanzengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
