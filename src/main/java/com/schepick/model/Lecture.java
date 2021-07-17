/*
package com.schepick.model;

import com.schepick.model.id.LectureId;

import javax.persistence.*;

@Entity
@Embeddable
public class Lecture {

    @EmbeddedId
    private LectureId lectureId;


    @Column
    @ManyToOne
    @JoinColumn(name = "subject_no")
    private Subject subject;

    private byte divideClassNum;

    private String professor;
    private String room;
    private short participantsMax;
}
*/