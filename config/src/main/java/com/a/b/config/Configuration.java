package com.a.b.config;

import com.a.b.commons.config.PropertyKey;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Configuration {

  String CONFIG_FOLDER_VARIABLE = "config.dir";
  String CONFIG_FILE = "app.properties";

  @PropertyKey("name")
  String name();

  @PropertyKey("cron")
  Optional<String> cronExpression();

  @PropertyKey("items")
  List<String> list();

  @PropertyKey("key.value.pairs")
  Map<String, String> map();

}
