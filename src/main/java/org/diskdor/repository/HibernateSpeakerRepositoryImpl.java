package org.diskdor.repository;

import org.diskdor.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
     @Override
     public List<Speaker> findAll(){
         List<Speaker> speakers = new ArrayList<Speaker>();
         Speaker speaker = new Speaker();

         speaker.setFirstName("Mehdi");
         speaker.setLastName("Fetouaki");

         speakers.add(speaker);
         return speakers;
     }
}
