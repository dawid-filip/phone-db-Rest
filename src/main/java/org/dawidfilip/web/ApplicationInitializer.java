package org.dawidfilip.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @SuppressWarnings("rawtypes")
	@Override
    protected Class<?>[] getRootConfigClasses() {
    	Class[] webServices = new Class[] {
    			ApplicationWebConfiguration.class
    	};
        return webServices;
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/rest/*" };
    }
 
}