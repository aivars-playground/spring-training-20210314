package org.example.basic.repository;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@RequiredArgsConstructor
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private List<Speaker> speakers = new ArrayList<>();

    @Override
    public List<Speaker> findAll() {
        return speakers;
    }

    public void addSpeaker(Speaker speaker) {
        speakers.add(speaker);
    }

}
