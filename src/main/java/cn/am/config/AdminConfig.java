package cn.am.config;

import cn.am.intercepter.AdminIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class AdminConfig extends WebMvcConfigurerAdapter {

	/**
	 * admin拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		 registry.addInterceptor(new AdminIntercepter()).addPathPatterns("/admin/**");
	}

}
