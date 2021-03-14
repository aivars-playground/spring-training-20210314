package org.example.basic.repository;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@RequiredArgsConstructor
public class SpeakerRepositoryImpl implements SpeakerRepository {

    private List<Speaker> speakers;

    @Override
    public List<Speaker> findAll() {
        return speakers;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("post construct");
        speakers = new ArrayList<>();

        Speaker sp = new Speaker();
        sp.setFirstName("demoFN");
        sp.setLastName("demoLN");
        addSpeaker(sp);
    }

    public void addSpeaker(Speaker speaker) {
        System.out.println("add:"+speaker);
        speakers.add(speaker);
    }

}
