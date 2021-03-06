package org.example.basic.repository;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository1")
@RequiredArgsConstructor
public class SpeakerRepositoryImpl1 implements SpeakerRepository {

    @Qualifier("calendarFactory") private final Calendar calendar;

    private List<Speaker> speakers;

    @PostConstruct
    private void initialize() {
        System.out.println("post construct");
        speakers = new ArrayList<>();

        Speaker sp = new Speaker();
        sp.setFirstName("demoFN1");
        sp.setLastName("demoLN1");
        addSpeaker(sp);
    }

    @Override
    public List<Speaker> findAll() {
        return speakers;
    }

    public void addSpeaker(Speaker speaker) {
        System.out.println(this.getClass() + " add:"+speaker + " @:"+calendar.getTime());
        speakers.add(speaker);
    }
}
