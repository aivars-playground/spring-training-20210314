package org.example.basic;

import org.example.basic.service.SpeakerService;
import org.example.basic.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
