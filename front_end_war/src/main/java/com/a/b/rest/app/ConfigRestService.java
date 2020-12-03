package com.a.b.rest.app;

import com.a.b.commons.config.Configs;
import com.a.b.config.Configuration;
import com.a.b.rest.api.ConfigRestApi;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.nio.file.Paths;

public class ConfigRestService implements ConfigRestApi {

  @Override
  public Response config() {
    return Response.ok(
      Paths.get(Configs.propertiesFilePath(
        Configuration.CONFIG_FOLDER_VARIABLE,
        Configuration.CONFIG_FILE))
        .toFile())
      .header(
        HttpHeaders.CONTENT_DISPOSITION,
        String.format("attachment; filename=\"%s\"", Configuration.CONFIG_FILE))
      .build();
  }
}
