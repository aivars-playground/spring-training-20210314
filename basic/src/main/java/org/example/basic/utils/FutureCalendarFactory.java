package org.example.basic.utils;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component("futureCalendarFactory")
public class FutureCalendarFactory implements FactoryBean<Calendar> {

    private Calendar calendar = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        calendar.add(Calendar.DAY_OF_YEAR,1);
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
