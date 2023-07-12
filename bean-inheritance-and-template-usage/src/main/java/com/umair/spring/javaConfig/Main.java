package com.umair.spring.javaConfig;

import com.umair.spring.ChildBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ChildBean childBean= applicationContext.getBean(ChildBean.class);
        System.out.println(childBean);

    }
}
