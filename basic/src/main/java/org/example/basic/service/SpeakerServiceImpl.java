package org.example.basic.service;

import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@lombok.RequiredArgsConstructor
public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
