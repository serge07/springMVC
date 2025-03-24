package com.example;

import com.example.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(AppInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses() {
        logger.info("No root configuration classes specified.");
        return new Class[0]; // Return an empty array instead of null to avoid potential NullPointerException
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        logger.info("Loading AppConfig for DispatcherServlet.");
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        logger.info("Mapping DispatcherServlet to root URL (/).");
        return new String[]{"/"};
    }
}
