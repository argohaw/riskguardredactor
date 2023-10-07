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

import com.ot2.ApiCallback;
import com.ot2.ApiClient;
import com.ot2.ApiException;
import com.ot2.ApiResponse;
import com.ot2.Configuration;
import com.ot2.Pair;
import com.ot2.ProgressRequestBody;
import com.ot2.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ot2.corecapture.Get415Response;
import com.ot2.corecapture.SessionGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SessionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SessionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for sessionDelete
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully logged off </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionDeleteCall(String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/session";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (suppressResponseCodes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("suppress_response_codes", suppressResponseCodes));
        }

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "na-1-dev.api.opentext.com", "capture.ot2.opentext.eu", "eu-1.api.opentext.com", "capture.ot2.opentext.com", "na-1.api.opentext.com" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sessionDeleteValidateBeforeCall(String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        return sessionDeleteCall(suppressResponseCodes, _callback);

    }

    /**
     * Deletes your session data.
     * As long as the session is still active, deleting your session will return HTTP status code 200. If the session has expired, then a 401 Unauthorized response is sent by the server.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully logged off </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public String sessionDelete(String suppressResponseCodes) throws ApiException {
        ApiResponse<String> localVarResp = sessionDeleteWithHttpInfo(suppressResponseCodes);
        return localVarResp.getData();
    }

    /**
     * Deletes your session data.
     * As long as the session is still active, deleting your session will return HTTP status code 200. If the session has expired, then a 401 Unauthorized response is sent by the server.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully logged off </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> sessionDeleteWithHttpInfo(String suppressResponseCodes) throws ApiException {
        okhttp3.Call localVarCall = sessionDeleteValidateBeforeCall(suppressResponseCodes, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes your session data. (asynchronously)
     * As long as the session is still active, deleting your session will return HTTP status code 200. If the session has expired, then a 401 Unauthorized response is sent by the server.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully logged off </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionDeleteAsync(String suppressResponseCodes, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = sessionDeleteValidateBeforeCall(suppressResponseCodes, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sessionGet
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionGetCall(String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/session";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (suppressResponseCodes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("suppress_response_codes", suppressResponseCodes));
        }

        final String[] localVarAccepts = {
            "application/hal+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sessionGetValidateBeforeCall(String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        return sessionGetCall(suppressResponseCodes, _callback);

    }

    /**
     * Retrieves the Session resource.
     * The Session resource will provide the URI for ending the session. This clears all the files and metadata in your session and allows for more efficient processing for future sessions related to your subscription.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return SessionGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public SessionGet200Response sessionGet(String suppressResponseCodes) throws ApiException {
        ApiResponse<SessionGet200Response> localVarResp = sessionGetWithHttpInfo(suppressResponseCodes);
        return localVarResp.getData();
    }

    /**
     * Retrieves the Session resource.
     * The Session resource will provide the URI for ending the session. This clears all the files and metadata in your session and allows for more efficient processing for future sessions related to your subscription.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return ApiResponse&lt;SessionGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SessionGet200Response> sessionGetWithHttpInfo(String suppressResponseCodes) throws ApiException {
        okhttp3.Call localVarCall = sessionGetValidateBeforeCall(suppressResponseCodes, null);
        Type localVarReturnType = new TypeToken<SessionGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves the Session resource. (asynchronously)
     * The Session resource will provide the URI for ending the session. This clears all the files and metadata in your session and allows for more efficient processing for future sessions related to your subscription.
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionGetAsync(String suppressResponseCodes, final ApiCallback<SessionGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = sessionGetValidateBeforeCall(suppressResponseCodes, _callback);
        Type localVarReturnType = new TypeToken<SessionGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
