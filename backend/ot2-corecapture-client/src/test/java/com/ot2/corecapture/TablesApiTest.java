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


package com.ot2.corecapture;

import com.ot2.ApiException;
import com.ot2.corecapture.Env;
import com.ot2.corecapture.Get415Response;
import com.ot2.corecapture.SessionTablesGet200Response;
import com.ot2.corecapture.SessionTablesTableIdGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TablesApi
 */
@Disabled
public class TablesApiTest {

    private final TablesApi api = new TablesApi();

    /**
     * Returns a list of available tables for the given environment.
     *
     * The server maintains different tables that provide information about key pieces of data to authenticated users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sessionTablesGetTest() throws ApiException {
        Env env = null;
        String suppressResponseCodes = null;
        SessionTablesGet200Response response = api.sessionTablesGet(env, suppressResponseCodes);
        // TODO: test validations
    }

    /**
     * Returns the table identified by tableId for the given environment.
     *
     * The Table Resource pertains to a specific table from the set of available tables on the server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sessionTablesTableIdGetTest() throws ApiException {
        String tableId = null;
        String view = null;
        String sort = null;
        Env env = null;
        String suppressResponseCodes = null;
        SessionTablesTableIdGet200Response response = api.sessionTablesTableIdGet(tableId, view, sort, env, suppressResponseCodes);
        // TODO: test validations
    }

}