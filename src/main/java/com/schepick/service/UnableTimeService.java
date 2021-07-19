package com.schepick.service;

import com.schepick.model.UnableTime;
import com.schepick.repository.UnableTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Service
public class UnableTimeService {
    private final UnableTimeRepository unableTimeRepository;

    @Autowired
    public UnableTimeService(UnableTimeRepository unableTimeRepository) {
        this.unableTimeRepository = unableTimeRepository;
    }

    public void makeUnableTime(String unDecodeStr) {
        String strSplit[] = decodeStr(unDecodeStr).split(",");
        short pivot = 0;
        for (byte period = 0; period < 14; period++) {
            for (byte week = 0; week < 5; week++) {
                if (strSplit[pivot].length() == 1 &&
                        strSplit[pivot].charAt(0) == '1') {
                    unableTimeRepository.save(new UnableTime(period, week));
                }
            }
        }
    }

    private String decodeStr(String str) {
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } finally {
            return str;
        }
    }
}
