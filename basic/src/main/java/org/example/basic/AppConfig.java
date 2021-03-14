package org.example.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.basic"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)      //default value
//    public SpeakerService getSpeakerService() {
//        System.out.println("--getSpeakerService");
//        //return new SpeakerServiceImpl(getSpeakerRepository());
//        return new SpeakerServiceImpl();
//    }

//    @Bean(name = "speakerRepository")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)      //default value
//    public SpeakerRepository getSpeakerRepository() {
//        System.out.println("--getSpeakerRepository");
//        return new HibernateSpeakerRepositoryImpl();
//    }


}
