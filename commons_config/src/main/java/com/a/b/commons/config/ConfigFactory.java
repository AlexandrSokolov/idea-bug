package com.a.b.commons.config;

public interface ConfigFactory {

  <T> T proxy(Class<T> configInterface);

}
