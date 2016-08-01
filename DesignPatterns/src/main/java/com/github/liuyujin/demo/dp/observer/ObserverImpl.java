package com.github.liuyujin.demo.dp.observer;

/**
 * Created by Administrator on 2016/7/31.
 */
public class ObserverImpl implements Observer {

    private String observeState;

    @Override
    public void update(Subject subject) {
        observeState = ((SubjectImpl) subject).getSubjectState();
    }
}
