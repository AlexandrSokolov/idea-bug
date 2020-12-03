package com.a.b.config;

import com.a.b.commons.config.Configs;

import javax.enterprise.inject.Produces;

import static com.a.b.config.Configuration.CONFIG_FILE;
import static com.a.b.config.Configuration.CONFIG_FOLDER_VARIABLE;

public class ConfigurationProducer {

  @Produces
  public Configuration produce(){
    return Configs.fileConfig(CONFIG_FOLDER_VARIABLE, CONFIG_FILE)
      .proxy(Configuration.class);
  }
}
