package com.example.boot.controllers;

import com.example.boot.models.Session;
import com.example.boot.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @PutMapping("{id}")
    public Session update(@PathVariable Long id, @RequestBody final Session session) {
        var existingSession = sessionRepository.getById(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(session);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        sessionRepository.deleteById(id);
    }
}
