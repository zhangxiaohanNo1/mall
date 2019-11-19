package com.macro.mall.dao;

import com.macro.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 优惠券管理自定义查询Dao
 * Created by macro on 2018/8/29.
 */
@Repository
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
