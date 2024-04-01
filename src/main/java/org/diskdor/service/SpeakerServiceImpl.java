package org.diskdor.service;

import org.diskdor.model.Speaker;
import org.diskdor.repository.HibernateSpeakerRepositoryImpl;
import org.diskdor.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll(){
        // utilize the repository we created
        return repository.findAll();
    }
}
