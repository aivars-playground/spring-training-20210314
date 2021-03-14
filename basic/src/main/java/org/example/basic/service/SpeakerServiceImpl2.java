package org.example.basic.service;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService2")
@RequiredArgsConstructor
public class SpeakerServiceImpl2 implements SpeakerService {

    @Qualifier("speakerRepository2") private final SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
