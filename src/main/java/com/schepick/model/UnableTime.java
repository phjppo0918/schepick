package com.schepick.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UnableTime {
    private byte week; // 0: 월 ~ 4: 금
    private byte period;
}
