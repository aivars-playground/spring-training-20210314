package org.example.basic.repository;

import org.example.basic.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    List<Speaker> findAll();
}
