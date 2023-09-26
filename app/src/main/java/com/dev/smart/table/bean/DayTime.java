package com.dev.smart.table.bean;


import com.dev.smart.form.annotation.ColumnType;
import com.dev.smart.form.annotation.SmartColumn;

import java.util.List;

/**
 * Created by huang on 2018/2/6.
 */

public class DayTime {
    @SmartColumn(id=3,name ="时间")
    private String time;
    @SmartColumn(type = ColumnType.ArrayChild)
    private List<Lesson> lessons;

    public DayTime() {
    }

    public DayTime(String time, List<Lesson> lessons) {
        this.time = time;
        this.lessons = lessons;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
