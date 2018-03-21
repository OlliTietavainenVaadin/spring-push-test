package org.test.pushtest;

import com.vaadin.spring.boot.internal.VaadinServletConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude={VaadinServletConfiguration.class})
public class MyVaadinServletConfiguration extends VaadinServletConfiguration {

    @Override
    protected String[] getUrlMappings() {
        String baseMapping = "foo";
        return new String[] { baseMapping, baseMapping + "/*", "/VAADIN/*" };
    }
}
