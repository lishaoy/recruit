package com.recruit.service;

import com.recruit.vo.Category;

/**
 * Created by lishaoyong on 17/3/12.
 */
public interface CategoryService {

    int insert(Category category);

    Category selectByPrimaryKey(Integer id);
}
