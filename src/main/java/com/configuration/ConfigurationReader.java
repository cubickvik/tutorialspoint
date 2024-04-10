package com.configuration;

import com.configuration.model.Configuration;
import lombok.Getter;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

public class ConfigurationReader {

    @Getter
    private static final Configuration configuration = loadConfig();


    private ConfigurationReader() {
    }

    private static Configuration loadConfig() {
        Yaml yaml = new Yaml(new Constructor(Configuration.class, new LoaderOptions()));
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("configuration.yaml");
        Configuration config = yaml.load(inputStream);
        return config;
    }
}
