package com.xworkz.medisales.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class MedicineWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ MediConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String []{"/"};
        }
    }

