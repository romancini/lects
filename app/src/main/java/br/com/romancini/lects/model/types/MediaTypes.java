package br.com.romancini.lects.model.types;

public enum MediaTypes {
    AUDIO("Áudio"),
    VIDEO("Vídeo"),
    IMAGE("Imagem"),
    OTHERS("Outros");

    private String description;

    MediaTypes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
