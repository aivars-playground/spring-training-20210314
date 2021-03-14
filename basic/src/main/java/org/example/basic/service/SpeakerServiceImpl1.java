package org.example.basic.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.basic.AppConfig;
import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService1")
@RequiredArgsConstructor
public class SpeakerServiceImpl1 implements SpeakerService {

    @Qualifier("speakerRepository1") private final SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
