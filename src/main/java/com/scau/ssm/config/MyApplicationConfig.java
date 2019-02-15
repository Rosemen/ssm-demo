package com.scau.ssm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * MyApplicationConfig:配置DispatcherServlet
 *
 * @author chen
 * @date  2019/02/14
 */
public class MyApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
