package org.example.basic.service;

import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Args Constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
