package com.recruit.service.impl;

import com.recruit.dao.CategoryDao;
import com.recruit.service.CategoryService;
import com.recruit.vo.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lishaoyong on 17/3/12.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "")
    CategoryDao categoryDao;


    @Override
    public int insert(Category category) {
        return categoryDao.insert(category);
    }

    @Override
    public Category selectByPrimaryKey(Integer id) {
        return categoryDao.selectByPrimaryKey(id);
    }
}
