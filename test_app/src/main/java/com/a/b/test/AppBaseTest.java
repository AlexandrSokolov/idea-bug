package com.a.b.test;

import com.a.b.commons.config.Configs;
import com.a.b.config.Configuration;
import com.a.b.commons.test.BaseTest;

public class AppBaseTest extends BaseTest {

  //you custom property file for tests is needed:
  //private static final String CONF_PROP = "test.app.properties";
  private static final String CONF_PROP = Configuration.CONFIG_FILE;

  public static final String BASIC_AUTH_PASSWORD = "admin123";

  public Configuration testConfig() {
    return Configs
      .fileConfig(testInputStream(CONF_PROP))
      .proxy(Configuration.class);
  }

}
