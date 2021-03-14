package org.example.basic;

import org.example.basic.repository.HibernateSpeakerRepositoryImpl;
import org.example.basic.repository.SpeakerRepository;
import org.example.basic.service.SpeakerService;
import org.example.basic.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)      //default value
    public SpeakerService getSpeakerService() {
        System.out.println("--getSpeakerService");
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)      //default value
    public SpeakerRepository getSpeakerRepository() {
        System.out.println("--getSpeakerRepository");
        return new HibernateSpeakerRepositoryImpl();
    }


}
