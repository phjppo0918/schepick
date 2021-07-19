package com.schepick.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UnableTime {
    private byte period;
    private byte week; // 0: 월 ~ 4: 금

    public UnableTime(){}

    public UnableTime(byte period, byte week) {
        this.period = period;
        this.week = week;
    }
}
