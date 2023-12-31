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

import com.ot2.corecapture.invoker.ApiCallback;
import com.ot2.corecapture.invoker.ApiClient;
import com.ot2.corecapture.invoker.ApiException;
import com.ot2.corecapture.invoker.ApiResponse;
import com.ot2.corecapture.invoker.Configuration;
import com.ot2.corecapture.invoker.Pair;
import com.ot2.corecapture.invoker.ProgressRequestBody;
import com.ot2.corecapture.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ot2.corecapture.model.Env;
import com.ot2.corecapture.model.Get415Response;
import com.ot2.corecapture.model.SessionTablesGet200Response;
import com.ot2.corecapture.model.SessionTablesTableIdGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TablesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TablesApi(ApiClient apiClient) {
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
     * Build call for sessionTablesGet
     * @param env  (required)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionTablesGetCall(Env env, String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/session/tables";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (env != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Env", env));
        }

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

        String[] localVarAuthNames = new String[] { "na-1-dev.api.opentext.com" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sessionTablesGetValidateBeforeCall(Env env, String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'env' is set
        if (env == null) {
            throw new ApiException("Missing the required parameter 'env' when calling sessionTablesGet(Async)");
        }

        return sessionTablesGetCall(env, suppressResponseCodes, _callback);

    }

    /**
     * Returns a list of available tables for the given environment.
     * The server maintains different tables that provide information about key pieces of data to authenticated users.
     * @param env  (required)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return SessionTablesGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public SessionTablesGet200Response sessionTablesGet(Env env, String suppressResponseCodes) throws ApiException {
        ApiResponse<SessionTablesGet200Response> localVarResp = sessionTablesGetWithHttpInfo(env, suppressResponseCodes);
        return localVarResp.getData();
    }

    /**
     * Returns a list of available tables for the given environment.
     * The server maintains different tables that provide information about key pieces of data to authenticated users.
     * @param env  (required)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return ApiResponse&lt;SessionTablesGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SessionTablesGet200Response> sessionTablesGetWithHttpInfo(Env env, String suppressResponseCodes) throws ApiException {
        okhttp3.Call localVarCall = sessionTablesGetValidateBeforeCall(env, suppressResponseCodes, null);
        Type localVarReturnType = new TypeToken<SessionTablesGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of available tables for the given environment. (asynchronously)
     * The server maintains different tables that provide information about key pieces of data to authenticated users.
     * @param env  (required)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionTablesGetAsync(Env env, String suppressResponseCodes, final ApiCallback<SessionTablesGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = sessionTablesGetValidateBeforeCall(env, suppressResponseCodes, _callback);
        Type localVarReturnType = new TypeToken<SessionTablesGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sessionTablesTableIdGet
     * @param tableId  (required)
     * @param view Fields or properties to return.  **Syntax:** ?view&#x3D;&lt;:view-name | comma-delim-field-list&gt;  **Note:** A view is followed by either a view name preceded by a colon or a list of fields. These are mutually exclusive. Two predefined views are provided - \&quot;:all\&quot; and \&quot;:default\&quot;. Both of these are equivalent and will return all columns for the data. If this query parameter is not provided, then the result will include all column data. (optional)
     * @param sort Used to sort the result.  **Syntax:** ?sort&#x3D;&lt;field [desc | asc]&gt;[,REPEATABLE]  **Note:** Sort is followed by a comma-separated list of fields and each field can have an optional sort order separated by a space. If the sort order is not specified, then the default sort order is ASC. If this query parameter is not provided at all, then the result will be sorted based on its first column in ascending order. (optional)
     * @param env  (optional, default to P)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionTablesTableIdGetCall(String tableId, String view, String sort, Env env, String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/session/tables/{tableId}"
            .replace("{" + "tableId" + "}", localVarApiClient.escapeString(tableId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (view != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("view", view));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (env != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("env", env));
        }

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

        String[] localVarAuthNames = new String[] { "na-1-dev.api.opentext.com" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sessionTablesTableIdGetValidateBeforeCall(String tableId, String view, String sort, Env env, String suppressResponseCodes, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tableId' is set
        if (tableId == null) {
            throw new ApiException("Missing the required parameter 'tableId' when calling sessionTablesTableIdGet(Async)");
        }

        return sessionTablesTableIdGetCall(tableId, view, sort, env, suppressResponseCodes, _callback);

    }

    /**
     * Returns the table identified by tableId for the given environment.
     * The Table Resource pertains to a specific table from the set of available tables on the server.
     * @param tableId  (required)
     * @param view Fields or properties to return.  **Syntax:** ?view&#x3D;&lt;:view-name | comma-delim-field-list&gt;  **Note:** A view is followed by either a view name preceded by a colon or a list of fields. These are mutually exclusive. Two predefined views are provided - \&quot;:all\&quot; and \&quot;:default\&quot;. Both of these are equivalent and will return all columns for the data. If this query parameter is not provided, then the result will include all column data. (optional)
     * @param sort Used to sort the result.  **Syntax:** ?sort&#x3D;&lt;field [desc | asc]&gt;[,REPEATABLE]  **Note:** Sort is followed by a comma-separated list of fields and each field can have an optional sort order separated by a space. If the sort order is not specified, then the default sort order is ASC. If this query parameter is not provided at all, then the result will be sorted based on its first column in ascending order. (optional)
     * @param env  (optional, default to P)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return SessionTablesTableIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public SessionTablesTableIdGet200Response sessionTablesTableIdGet(String tableId, String view, String sort, Env env, String suppressResponseCodes) throws ApiException {
        ApiResponse<SessionTablesTableIdGet200Response> localVarResp = sessionTablesTableIdGetWithHttpInfo(tableId, view, sort, env, suppressResponseCodes);
        return localVarResp.getData();
    }

    /**
     * Returns the table identified by tableId for the given environment.
     * The Table Resource pertains to a specific table from the set of available tables on the server.
     * @param tableId  (required)
     * @param view Fields or properties to return.  **Syntax:** ?view&#x3D;&lt;:view-name | comma-delim-field-list&gt;  **Note:** A view is followed by either a view name preceded by a colon or a list of fields. These are mutually exclusive. Two predefined views are provided - \&quot;:all\&quot; and \&quot;:default\&quot;. Both of these are equivalent and will return all columns for the data. If this query parameter is not provided, then the result will include all column data. (optional)
     * @param sort Used to sort the result.  **Syntax:** ?sort&#x3D;&lt;field [desc | asc]&gt;[,REPEATABLE]  **Note:** Sort is followed by a comma-separated list of fields and each field can have an optional sort order separated by a space. If the sort order is not specified, then the default sort order is ASC. If this query parameter is not provided at all, then the result will be sorted based on its first column in ascending order. (optional)
     * @param env  (optional, default to P)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @return ApiResponse&lt;SessionTablesTableIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SessionTablesTableIdGet200Response> sessionTablesTableIdGetWithHttpInfo(String tableId, String view, String sort, Env env, String suppressResponseCodes) throws ApiException {
        okhttp3.Call localVarCall = sessionTablesTableIdGetValidateBeforeCall(tableId, view, sort, env, suppressResponseCodes, null);
        Type localVarReturnType = new TypeToken<SessionTablesTableIdGet200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the table identified by tableId for the given environment. (asynchronously)
     * The Table Resource pertains to a specific table from the set of available tables on the server.
     * @param tableId  (required)
     * @param view Fields or properties to return.  **Syntax:** ?view&#x3D;&lt;:view-name | comma-delim-field-list&gt;  **Note:** A view is followed by either a view name preceded by a colon or a list of fields. These are mutually exclusive. Two predefined views are provided - \&quot;:all\&quot; and \&quot;:default\&quot;. Both of these are equivalent and will return all columns for the data. If this query parameter is not provided, then the result will include all column data. (optional)
     * @param sort Used to sort the result.  **Syntax:** ?sort&#x3D;&lt;field [desc | asc]&gt;[,REPEATABLE]  **Note:** Sort is followed by a comma-separated list of fields and each field can have an optional sort order separated by a space. If the sort order is not specified, then the default sort order is ASC. If this query parameter is not provided at all, then the result will be sorted based on its first column in ascending order. (optional)
     * @param env  (optional, default to P)
     * @param suppressResponseCodes This can be left without an assignment or you can use itself, suppress_response_codes&#x3D;suppress_response_codes (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sessionTablesTableIdGetAsync(String tableId, String view, String sort, Env env, String suppressResponseCodes, final ApiCallback<SessionTablesTableIdGet200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = sessionTablesTableIdGetValidateBeforeCall(tableId, view, sort, env, suppressResponseCodes, _callback);
        Type localVarReturnType = new TypeToken<SessionTablesTableIdGet200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
