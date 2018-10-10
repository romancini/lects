package br.com.romancini.lects.model.types;

public enum UserType {
    ADMIN("Admin"),
    TEACHER("Professor"),
    STUDENT("Aluno");

    private String description;

    UserType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
