package com.umair.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean myBean = applicationContext.getBean("myBean",MyBean.class);
        myBean.sayHello();

        MyBean myBean1 = applicationContext.getBean("myBeanNotCustomized",MyBean.class);
        myBean1.sayHello();

    }
}
