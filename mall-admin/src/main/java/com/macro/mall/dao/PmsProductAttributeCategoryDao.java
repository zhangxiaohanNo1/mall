package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 * Created by macro on 2018/5/24.
 */
@Repository
public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
