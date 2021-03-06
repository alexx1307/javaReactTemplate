package com.lukaaps.myfm;

import com.lukaaps.myfm.gameLogic.GameLogic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        GameLogic game = context.getBean(GameLogic.class);
        game.start();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
