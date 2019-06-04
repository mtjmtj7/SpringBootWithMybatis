package cn.am.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.am.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class UserIntercepter implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 是否登录验证
		HttpSession session = request.getSession();
		User userNow = new User();
		//session取值
		userNow = (User) session.getAttribute("userNow");
		if (userNow != null) {
			//当前用户已登录
			return true;
		} else {
			//未登录 跳转登录页面
			response.sendRedirect("/toLogin");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//处理请求 到 渲染视图之间
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//渲染视图之后
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
