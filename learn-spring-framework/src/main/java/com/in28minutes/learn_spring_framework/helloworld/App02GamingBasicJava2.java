package com.in28minutes.learn_spring_framework.helloworld;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;

public class App02GamingBasicJava2 {
    public static void main(String[] args) {

        // 1: Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            // 2: Configure the things that we want Spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name - @Bean
            // job - @Bean

            var name_bean_value = context.getBean("name");
            var job_bean_value = context.getBean("job");
            var person_bean_value = context.getBean("person");
            var address_bean_value = context.getBean("address");
            var address_2_bean_value = context.getBean("custom_name");
            var person_2_bean_value = context.getBean("person_autowiring_1");
            var person_3_bean_value = context.getBean("person_autowiring_2");

            System.out.println(name_bean_value);
            System.out.println(job_bean_value);
            System.out.println(person_bean_value + "\n");
            System.out.println(address_bean_value);
            System.out.println(address_2_bean_value);
            System.out.println(person_2_bean_value);
            System.out.println(person_3_bean_value);

            System.out.println("Explicit Beans:");
            Arrays.stream(context.getBeanDefinitionNames())
                    .filter(beanName -> isExplicitBean(context, beanName))
                    .forEach(System.out::println);

            System.out.println("\nImplicit Beans:");
            Arrays.stream(context.getBeanDefinitionNames())
                    .filter(beanName -> !isExplicitBean(context, beanName))
                    .forEach(System.out::println);
        } // Close try-with-resources block
    }

    private static boolean isExplicitBean(ApplicationContext context, String beanName) {
        BeanDefinition beanDefinition = ((AnnotationConfigApplicationContext) context).getBeanFactory().getBeanDefinition(beanName);
        return beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION;
    }
}
