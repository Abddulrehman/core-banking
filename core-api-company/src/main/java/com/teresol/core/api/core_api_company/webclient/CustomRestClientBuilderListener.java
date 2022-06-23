/*! \brief <b>Folder Description </b> \n This folder contains the http client interface which is used to communicate to other microservices.
 *
 * 
 */



package com.teresol.core.api.core_api_company.webclient;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.spi.RestClientBuilderListener;
import org.jboss.logging.Logger;

public class CustomRestClientBuilderListener implements RestClientBuilderListener {

  private static final Logger LOG = Logger.getLogger(CustomRestClientBuilderListener.class);

  @Override
  public void onNewBuilder(RestClientBuilder builder) {
    LOG.info("Setting connectionTTL: 60000");
    builder.property("resteasy.connectionTTL", Arrays.asList(60000L, TimeUnit.MILLISECONDS));
  }
}
