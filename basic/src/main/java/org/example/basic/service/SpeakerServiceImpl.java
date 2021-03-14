package org.example.basic.service;

import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Setter");
        this.repository = repository;
    }

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("No Args Constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Args Constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
