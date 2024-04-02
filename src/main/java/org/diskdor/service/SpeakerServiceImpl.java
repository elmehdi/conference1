package org.diskdor.service;

import org.diskdor.model.Speaker;
import org.diskdor.repository.HibernateSpeakerRepositoryImpl;
import org.diskdor.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
   // private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl(); // we get rid of this hard coded-instance
    // had l'object ghayweli ytsetta b lbean dial service li ghadi ykhdem b lbean dial repository graca à setter li zedna lte7t
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){ // Constructor Injection
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }
    @Override
    public List<Speaker> findAll(){
        // utilize the repository we created
        return repository.findAll();
    }
    public void setRepository(SpeakerRepository repository) { //Setter Injection : bach nsetiw repo f lbean dial Service // BACH NINJECTIW REPOSITORY
        System.out.println("SpeakerServiceImpl Setter");
        this.repository = repository;
    }
}
