package org.example.basic.service;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.example.basic.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpeakerServiceImpl implements SpeakerService {

    @Qualifier("zzzz")
    private final SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
