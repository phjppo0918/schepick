package com.schepick.model.id;

import com.schepick.model.Subject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class LectureId implements Serializable {

    @Column(name="subject_no")
    private long subjectNo;

    @ManyToOne
    @JoinColumn(name = "subject_no")
    @Column(name="divideClass_num")
    private Subject subject;
}
