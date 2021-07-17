package com.schepick.repository;

import com.schepick.model.UnableTime;

import java.util.List;

public interface UnableTimeRepository {
    public UnableTime save(UnableTime unableTime);
    public List<UnableTime> findAll();
}
