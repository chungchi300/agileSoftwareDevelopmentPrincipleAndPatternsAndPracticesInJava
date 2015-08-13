package com;

import java.util.Date;

/**
 * Created by Administrator on 2015/8/7.
 */
public class TimeCard {
    private Date date;
    private int hour;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
}
