package br.com.romancini.lects.dto;

import java.util.List;

import br.com.romancini.lects.model.LearningObj;

public class LearningObjSync {
    private List<LearningObj> learningObjs;

    public List<LearningObj> getLearningObj(){
        return learningObjs;
    }
}
