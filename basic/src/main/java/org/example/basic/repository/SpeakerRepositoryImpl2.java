package org.example.basic.repository;

import lombok.RequiredArgsConstructor;
import org.example.basic.model.Speaker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository2")
@RequiredArgsConstructor
public class SpeakerRepositoryImpl2 implements SpeakerRepository {

    @Qualifier("futureCalendarFactory") private final Calendar calendar;

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
        sp.setFirstName("demoFN2");
        sp.setLastName("demoLN2");
        addSpeaker(sp);
    }

    public void addSpeaker(Speaker speaker) {
        System.out.println(this.getClass() + " add:"+speaker + " @:"+calendar.getTime());
        speakers.add(speaker);
    }

}
