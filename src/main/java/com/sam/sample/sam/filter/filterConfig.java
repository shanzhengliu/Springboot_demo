//过滤配置注册
package com.sam.sample.sam.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class filterConfig {
    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new myfilter());
        registration.addUrlPatterns("/*");
        registration.setName("MyConfig");
        registration.setOrder(1);
        return registration;
    }
}
