package com.recruit.controller;


import com.recruit.service.CategoryService;
import com.recruit.vo.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by 58 on 2016/10/10.
 */
@Controller
public class Demo {

    @Resource
    CategoryService categoryService;

    /**
     * 跳转到服务监控主页
     */
    @RequestMapping(value = "/demo" , method = {RequestMethod.GET, RequestMethod.POST})
    public String index( ModelMap modelMap,HttpServletRequest request){
        Category category = categoryService.selectByPrimaryKey(1);
        modelMap.addAttribute("category",category);
        return "/views/demo";
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        return ModelAndView("/views/index");
        return "/views/index";
    }
}
