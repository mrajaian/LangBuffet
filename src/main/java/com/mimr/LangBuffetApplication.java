package com.mimr;

import com.mimr.config.LangBuffetConfiguration;
import com.mimr.resource.WordResource;
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
        final WordResource wordResource = new WordResource();
        environment.jersey().register(wordResource);
    }
}
