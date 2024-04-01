package org.diskdor.service;

import org.diskdor.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
