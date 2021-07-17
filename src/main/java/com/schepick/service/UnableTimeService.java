package com.schepick.service;

import com.schepick.repository.UnableTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnableTimeService {
    private final UnableTimeRepository unableTimeRepository;

    @Autowired
    public UnableTimeService(UnableTimeRepository unableTimeRepository) {
        this.unableTimeRepository = unableTimeRepository;
    }

}
