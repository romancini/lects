package br.com.romancini.lects.model;

import java.util.List;

public class Lesson {
    private String id;
    private String title;
    private String description;
    private List<LearningObj> learningObjs;
    private User owner;

    public Lesson(String id, String title, String description, List<LearningObj> learningObjs, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.learningObjs = learningObjs;
        this.owner = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LearningObj> getLearningObjs() {
        return learningObjs;
    }

    public void setLearningObjs(List<LearningObj> learningObjs) {
        this.learningObjs = learningObjs;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User user) {
        this.owner = user;
    }
}
