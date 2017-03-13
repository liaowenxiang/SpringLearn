package com.lwx.springdemo8;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2017/3/1.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
