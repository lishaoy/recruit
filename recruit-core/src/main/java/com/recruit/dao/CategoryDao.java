package com.recruit.dao;

import com.recruit.vo.Category;

/**
 * Created by lishaoyong on 17/3/12.
 */
public interface CategoryDao {


    int insert(Category record);

    Category selectByPrimaryKey(Integer id);
}
