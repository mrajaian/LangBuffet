package com.mimr.service;

import com.mimr.model.Word;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class WordService {

    private final ConcurrentHashMap<String, Word> wordCache;

    @Inject
    public WordService() {
        this.wordCache = new ConcurrentHashMap<>();
    }

    public void upsertWord(Word word) {
        if (word.getId() == null) {
            String key = UUID.randomUUID().toString();
            word.setId(key);
            wordCache.put(key, word);
        }
        wordCache.put(word.getId(), word);
    }
}
