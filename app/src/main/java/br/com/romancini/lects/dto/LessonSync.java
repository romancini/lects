package br.com.romancini.lects.dto;

import java.util.List;

import br.com.romancini.lects.model.Lesson;

public class LessonSync {

    private List<Lesson> lessons;

    public List<Lesson> getLessons(){
        return lessons;
    }
}
