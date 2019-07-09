package com.ithima.interceptor;

import com.ithima.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author tree
 * @Date 2019/6/10 19:46
 * @Version 1.8
 **/
public class LoginInterceptor implements HandlerInterceptor{

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handle){
        //获取请求的URL
        String url = request.getRequestURI();
        //URL:除了登陆请求外，其它的URL都进行拦截控制
        if(url.indexOf("/login.action")>=0){
            return true;
        }
      //  获取Session
        HttpSession session = request.getSession();
        User user=(User)session.getAttribute("USER_SESSION");
        //判断Session中是否有用户数据，如果有，则返回true，继续向下执行
        if(user!=null){
            return true;
        }
        //不符合条件的给出提示信息，并转发到登陆页面
        request.setAttribute("msg","你还没有登陆,请先登陆");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {

    }
}

