package org.example.basic;

import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepositoryImpl;
import org.example.basic.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        {
            SpeakerRepositoryImpl repo = applicationContext.getBean("speakerRepository", SpeakerRepositoryImpl.class);
            Speaker sp = new Speaker();
            sp.setFirstName("demoFN");
            sp.setLastName("demoLN");
            repo.addSpeaker(sp);
        }

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
