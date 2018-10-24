package br.com.romancini.lects.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lesson {
    private String _id;
    private String title;
    private String description;
    private List<String> learningObjs;
    private String owner;

    public Lesson() {
        super();
    }

    public Lesson(String _id, String title, String description, List<String> learningObjs, String user) {
        this.set_id(_id);
        this.title = title;
        this.description = description;
        this.learningObjs = learningObjs;
        this.owner = user;
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

    public List<String> getLearningObjs() {
        return learningObjs;
    }

    public void setLearningObjs(List<String> learningObjs) {
        this.learningObjs = learningObjs;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String user) {
        this.owner = user;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
