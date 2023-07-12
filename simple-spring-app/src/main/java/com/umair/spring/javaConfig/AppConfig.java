package com.umair.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    /*In this case, the method name myBean is used as the default bean name.
    So, the bean name is automatically set as "myBean".
    However, you can provide a custom name for a bean in Java-based configuration by using the name attribute of the @Bean annotation:*/
    @Bean
    public MyBean myBean() {
        MyBean myBeanObj = new MyBean();
        myBeanObj.setGreeting("Hello Umer!");
        return  myBeanObj;
    }

    @Bean(name = "myBeanNotCustomized")
    public MyBean myBean1(){
        return new MyBean();
    }
}
