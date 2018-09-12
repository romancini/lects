package br.com.romancini.lects.model;

import java.util.List;

import br.com.romancini.lects.model.types.AnswerTypes;
import br.com.romancini.lects.model.types.MediaTypes;

public class LearningObj {
    private String id;
    private String question;
    private MediaTypes mediaType;
    private String mediaUrl;
    private AnswerTypes answerType;
    private List<Answer> answers;
    private User owner;

    public LearningObj(String id, String question, MediaTypes mediaType, String mediaUrl, AnswerTypes answerType, List<Answer> answers, User owner) {
        this.id = id;
        this.setQuestion(question);
        this.setMediaType(mediaType);
        this.setMediaUrl(mediaUrl);
        this.setAnswerType(answerType);
        this.setAnswers(answers);
        this.setOwner(owner);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public MediaTypes getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypes mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public AnswerTypes getAnswerType() {
        return answerType;
    }

    public void setAnswerType(AnswerTypes answerType) {
        this.answerType = answerType;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
