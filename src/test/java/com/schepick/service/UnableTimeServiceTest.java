package com.schepick.service;

import com.schepick.repository.UnableTimeRepository;
import com.schepick.repository.impliment.UnableTimeMemoryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


class UnableTimeServiceTest {
    UnableTimeRepository unableTimeRepository = new UnableTimeMemoryRepository();
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void 문자열_split_개수_테스트() {
        String 샘플[] = "1,1,1,1,1".split(",");
        logger.trace(샘플.length+"");
        Assertions.assertThat(샘플.length).isEqualTo(5);
    }
}