/*
 * Core Capture Services
 * OpenText Core Capture Services are a set of RESTful web service interfaces that provides capture functionality. Being developed in a purely RESTful style, Core Capture Services are easier to consume for the purposes of writing custom clients.  Core Capture Services identifies resources by Uniform Resource Identifiers (URIs). It defines specific media types to represent resources and drives application state transfers by using link relations. It uses a limited number of HTTP standard methods (GET, POST, and DELETE) to manipulate these resources over the HTTP protocol.  Core Capture Services (hereafter simply called, \"service\") supports only the JSON format for resource representation. JavaScript Object Notation (JSON) is a lightweight data interchange format based on a subset of the JavaScript Programming Language standard.
 *
 * The version of the OpenAPI document: 23.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ot2.corecapture.api;

import com.ot2.corecapture.invoker.ApiException;
import com.ot2.corecapture.model.AboutGet200Response;
import com.ot2.corecapture.model.Get200Response;
import com.ot2.corecapture.model.Get415Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HomeApi
 */
@Disabled
public class HomeApiTest {

    private final HomeApi api = new HomeApi();

    /**
     * Provides product version information.
     *
     * This resource provides product information about the Services installation to authenticated users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void aboutGetTest() throws ApiException {
        String suppressResponseCodes = null;
        AboutGet200Response response = api.aboutGet(suppressResponseCodes);
        // TODO: test validations
    }

    /**
     * The Home Document is an entry point to the Core Capture Services.
     *
     * The Home Document is an entry point to the Core Capture Services. It is available to any caller. Its main purposes it to provide discovery of the URIs necessary to interact with the service. It is retrieved by performing an HTTP GET on the base installation path. So for example if the REST service was installed into https://{host}/cp-rest/v2, then performing a GET on this URI would return the Home Document. Its main purposes is to provide discovery of the URIs necessary to interact with the service. All clients must start from the Home Document and follow the hrefs given in the link relations to the resources desired. This is important to ensure that your client applications will always work regardless of the URI changes that may take place under different deployment configurations of the service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rootGetTest() throws ApiException {
        String suppressResponseCodes = null;
        Get200Response response = api.rootGet(suppressResponseCodes);
        // TODO: test validations
    }

}
