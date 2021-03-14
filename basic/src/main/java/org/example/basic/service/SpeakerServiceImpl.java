package org.example.basic.service;

import org.example.basic.model.Speaker;
import org.example.basic.repository.HibernateSpeakerRepositoryImpl;
import org.example.basic.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
