package com.schepick.repository.impliment;

import com.schepick.model.UnableTime;
import com.schepick.repository.UnableTimeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UnableTimeMemoryRepository implements UnableTimeRepository {
    List<UnableTime> unableTimes = new ArrayList<>();

    @Override
    public UnableTime save(UnableTime unableTime) {
        unableTimes.add(unableTime);
        return unableTime;
    }

    @Override
    public List<UnableTime> findAll() {
        return unableTimes;
    }
}
