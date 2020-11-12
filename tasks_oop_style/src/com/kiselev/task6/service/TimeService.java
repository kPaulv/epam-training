package com.kiselev.task6.service;

import com.kiselev.task6.entity.Time;

public class TimeService {
    public int getMinutesAmount(Time time) {
        return time.getSeconds() / 60 - getHoursAmount(time)*60;
    }

    public int getHoursAmount(Time time) {
        return time.getSeconds() / 3600;
    }

    public int getSecondsAmount(Time time) {
        return time.getSeconds() - getHoursAmount(time) * 3600 - getMinutesAmount(time) * 60;
    }
}
