package com.a.b.commons.config;

import static com.a.b.commons.config.TestPropertiesConfig.NOT_EXISTING_PROP_KEY;

public interface NotExistingStringConfig {

  @PropertyKey(NOT_EXISTING_PROP_KEY)
  String notExistingProperty();
}
