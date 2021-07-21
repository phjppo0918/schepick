package com.schepick.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private String depart;
    private byte grade;
    private String minor;
    private String doubleMajor;
    private String convergenceMajor;
    private boolean isCosmos;

}
