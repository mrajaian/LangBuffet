package com.mimr.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class LangBuffetConfiguration extends Configuration {
    private String env = "dev";

    @JsonProperty
    public String getEnv() {
        return env;
    }

    @JsonProperty
    public void setEnv(String env) {
        this.env = env;
    }
}
