package br.com.romancini.lects.model.types;

public enum AnswerTypes {

    TEST("Mutuamente Exclusiva"),
    TEXT("Dissertativa"),
    TRUE_OR_FALSE("Múltiplas Respostas");

    private String description;

    AnswerTypes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
