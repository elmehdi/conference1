package org.diskdor.service;

import org.diskdor.model.Speaker;
import org.diskdor.repository.HibernateSpeakerRepositoryImpl;
import org.diskdor.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
   // private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl(); // we get rid of this hard coded-instance
    // had l'object ghayweli ytsetta b lbean dial service li ghadi ykhdem b lbean dial repository graca à setter li zedna lte7t
    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){ // Constructor
        repository = speakerRepository;
    }
    @Override
    public List<Speaker> findAll(){
        // utilize the repository we created
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) { // had setter zednah bach nsetiw repo f lbean dial Service // BACH NINJECTIW REPOSITORY
        this.repository = repository;
    }
}
