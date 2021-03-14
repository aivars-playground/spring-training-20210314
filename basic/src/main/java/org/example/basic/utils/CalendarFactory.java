package org.example.basic.utils;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component("calendarFactory")
public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar calendar = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
