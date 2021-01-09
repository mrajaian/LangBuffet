package com.mimr;

import com.mimr.config.LangBuffetConfiguration;
import com.mimr.resource.WordResource;
import com.mimr.service.WordService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class LangBuffetApplication extends Application<LangBuffetConfiguration>{

    public static void main(String[] args) throws Exception {
        new LangBuffetApplication().run(args);
    }

    @Override
    public String getName() {
        return "LangBuffet";
    }

    @Override
    public void run(LangBuffetConfiguration langBuffetConfiguration, Environment environment) {
        final WordService wordService = new WordService();
        final WordResource wordResource = new WordResource(wordService);
        environment.jersey().register(wordService);
        environment.jersey().register(wordResource);
    }
}
