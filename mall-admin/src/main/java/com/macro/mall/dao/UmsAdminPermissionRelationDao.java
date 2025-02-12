package com.macro.mall.dao;

import com.macro.mall.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户权限自定义Dao
 * Created by macro on 2018/10/8.
 */
@Repository
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
