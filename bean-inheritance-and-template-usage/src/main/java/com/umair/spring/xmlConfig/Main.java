package com.umair.spring.xmlConfig;

import com.umair.spring.ChildBean;
import com.umair.spring.javaConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springBeanConfig.xml");

        ChildBean childBean= applicationContext.getBean(ChildBean.class);
        System.out.println(childBean);

    }
}
