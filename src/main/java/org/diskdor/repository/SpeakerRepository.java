package org.diskdor.repository;

import org.diskdor.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
