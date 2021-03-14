package org.example.basic.repository;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@RequiredArgsConstructor
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private List<Speaker> speakers;

    @Override
    public List<Speaker> findAll() {
        return speakers;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("post construct");
        speakers = new ArrayList<>();
    }

    public void addSpeaker(Speaker speaker) {
        System.out.println("add:"+speaker);
        speakers.add(speaker);
    }

}
