package com.mimr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mimr.validation.Update;

import javax.validation.constraints.*;

public class Word {

    @NotEmpty(groups = {Update.class})
    private String id;
    private final Language language;
    @NotEmpty
    @Size(min = 1)
    private final String originalWord;
    private final String translatedWord;
    @Email
    private final String addedBy;

    @JsonCreator
    public Word(@JsonProperty("id") String id,
                @JsonProperty("language") Language language,
                @JsonProperty("originalWord") String originalWord,
                @JsonProperty("translatedWord") String translatedWord,
                @JsonProperty("addedBy") String addedBy) {
        this.id = id;
        this.language = language;
        this.originalWord = originalWord;
        this.translatedWord = translatedWord;
        this.addedBy = addedBy;
    }

    public String getId() {
        return id;
    }

    public Language getLanguage() {
        return language;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setId(String id){
        this.id = id;
    }

}
