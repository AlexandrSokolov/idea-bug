package com.a.b.commons.config;

import java.util.Collections;

import static com.a.b.commons.config.TestPropertiesConfig.STRING_PROP_KEY1;

public interface UnsupportedReturnTypeConfig {

  @PropertyKey(STRING_PROP_KEY1)
  Collections unsupportedReturnType();
}
