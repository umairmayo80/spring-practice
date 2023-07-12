package com.umair.spring.javaConfig;

import com.umair.spring.ChildBean;
import com.umair.spring.ParentBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ParentBean parentBean(){
        ParentBean parentBean = new ParentBean();
        parentBean.setMessage("Hello from parent bean");
        return parentBean;
    }

    @Bean
    public ChildBean childBean(){
        ChildBean childBean = new ChildBean();
        childBean.setCount(5);
        return childBean;
    }
}
