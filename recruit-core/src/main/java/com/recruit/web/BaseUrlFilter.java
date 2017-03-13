package com.recruit.web;




import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by lishaoyong on 16/3/15.
 */
public class BaseUrlFilter implements Filter {

//    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

//    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        req.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String appName = req.getContextPath()+"/";
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+appName;
        request.setAttribute("appName",appName);
        request.setAttribute("basePath",basePath);
        chain.doFilter(request, response);

    }

//    @Override
    public void destroy() {

    }

}
