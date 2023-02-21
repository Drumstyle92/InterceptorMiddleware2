package co.develhope.InterceptorMiddleware2.configurations;

import co.develhope.InterceptorMiddleware2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Drumstyle92
 * Class for configuring interceptors
 */
@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    /**
     * Instance variable of the interceptor with automatic insertion to be able to configure it
     */
    @Autowired
    private MonthInterceptor monthInterceptor;

    /**
     * @param registry parameter where the interceptor we will use passes
     * Method to be able to register the interceptor so that it can be used
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(monthInterceptor).addPathPatterns("/months");

    }
}
