package com.github.liuyujin.demo.dp.observer;

/**
 * Created by Administrator on 2016/7/31.
 */
public class SubjectImpl extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObserver();
    }
}
