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


package com.ot2.corecapture.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ot2.corecapture.model.BasicResultItemWithValuesAndFiles;
import com.ot2.corecapture.model.ReturnStatusBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ot2.corecapture.invoker.JSON;

/**
 * SessionServicesProcessimagepipelinePost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T00:05:58.836985800+05:30[Asia/Calcutta]")
public class SessionServicesProcessimagepipelinePost200Response {
  public static final String SERIALIZED_NAME_RETURN_STATUS = "returnStatus";
  @SerializedName(SERIALIZED_NAME_RETURN_STATUS)
  private ReturnStatusBody returnStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_EXECUTION_MILLI_SECONDS = "executionMilliSeconds";
  @SerializedName(SERIALIZED_NAME_EXECUTION_MILLI_SECONDS)
  private String executionMilliSeconds;

  public static final String SERIALIZED_NAME_LICENSE_PAGES_USED = "licensePagesUsed";
  @SerializedName(SERIALIZED_NAME_LICENSE_PAGES_USED)
  private Integer licensePagesUsed;

  public static final String SERIALIZED_NAME_LICENSE_PAGES_USED2 = "licensePagesUsed2";
  @SerializedName(SERIALIZED_NAME_LICENSE_PAGES_USED2)
  private Integer licensePagesUsed2;

  public static final String SERIALIZED_NAME_RESULT_ITEMS = "resultItems";
  @SerializedName(SERIALIZED_NAME_RESULT_ITEMS)
  private List<BasicResultItemWithValuesAndFiles> resultItems;

  public SessionServicesProcessimagepipelinePost200Response() {
  }

  public SessionServicesProcessimagepipelinePost200Response returnStatus(ReturnStatusBody returnStatus) {
    
    this.returnStatus = returnStatus;
    return this;
  }

   /**
   * Get returnStatus
   * @return returnStatus
  **/
  @javax.annotation.Nullable
  public ReturnStatusBody getReturnStatus() {
    return returnStatus;
  }


  public void setReturnStatus(ReturnStatusBody returnStatus) {
    this.returnStatus = returnStatus;
  }


  public SessionServicesProcessimagepipelinePost200Response id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SessionServicesProcessimagepipelinePost200Response serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public SessionServicesProcessimagepipelinePost200Response executionMilliSeconds(String executionMilliSeconds) {
    
    this.executionMilliSeconds = executionMilliSeconds;
    return this;
  }

   /**
   * Get executionMilliSeconds
   * @return executionMilliSeconds
  **/
  @javax.annotation.Nullable
  public String getExecutionMilliSeconds() {
    return executionMilliSeconds;
  }


  public void setExecutionMilliSeconds(String executionMilliSeconds) {
    this.executionMilliSeconds = executionMilliSeconds;
  }


  public SessionServicesProcessimagepipelinePost200Response licensePagesUsed(Integer licensePagesUsed) {
    
    this.licensePagesUsed = licensePagesUsed;
    return this;
  }

   /**
   * Get licensePagesUsed
   * @return licensePagesUsed
  **/
  @javax.annotation.Nullable
  public Integer getLicensePagesUsed() {
    return licensePagesUsed;
  }


  public void setLicensePagesUsed(Integer licensePagesUsed) {
    this.licensePagesUsed = licensePagesUsed;
  }


  public SessionServicesProcessimagepipelinePost200Response licensePagesUsed2(Integer licensePagesUsed2) {
    
    this.licensePagesUsed2 = licensePagesUsed2;
    return this;
  }

   /**
   * Get licensePagesUsed2
   * @return licensePagesUsed2
  **/
  @javax.annotation.Nullable
  public Integer getLicensePagesUsed2() {
    return licensePagesUsed2;
  }


  public void setLicensePagesUsed2(Integer licensePagesUsed2) {
    this.licensePagesUsed2 = licensePagesUsed2;
  }


  public SessionServicesProcessimagepipelinePost200Response resultItems(List<BasicResultItemWithValuesAndFiles> resultItems) {
    
    this.resultItems = resultItems;
    return this;
  }

  public SessionServicesProcessimagepipelinePost200Response addResultItemsItem(BasicResultItemWithValuesAndFiles resultItemsItem) {
    if (this.resultItems == null) {
      this.resultItems = new ArrayList<>();
    }
    this.resultItems.add(resultItemsItem);
    return this;
  }

   /**
   * Get resultItems
   * @return resultItems
  **/
  @javax.annotation.Nullable
  public List<BasicResultItemWithValuesAndFiles> getResultItems() {
    return resultItems;
  }


  public void setResultItems(List<BasicResultItemWithValuesAndFiles> resultItems) {
    this.resultItems = resultItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionServicesProcessimagepipelinePost200Response sessionServicesProcessimagepipelinePost200Response = (SessionServicesProcessimagepipelinePost200Response) o;
    return Objects.equals(this.returnStatus, sessionServicesProcessimagepipelinePost200Response.returnStatus) &&
        Objects.equals(this.id, sessionServicesProcessimagepipelinePost200Response.id) &&
        Objects.equals(this.serviceName, sessionServicesProcessimagepipelinePost200Response.serviceName) &&
        Objects.equals(this.executionMilliSeconds, sessionServicesProcessimagepipelinePost200Response.executionMilliSeconds) &&
        Objects.equals(this.licensePagesUsed, sessionServicesProcessimagepipelinePost200Response.licensePagesUsed) &&
        Objects.equals(this.licensePagesUsed2, sessionServicesProcessimagepipelinePost200Response.licensePagesUsed2) &&
        Objects.equals(this.resultItems, sessionServicesProcessimagepipelinePost200Response.resultItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnStatus, id, serviceName, executionMilliSeconds, licensePagesUsed, licensePagesUsed2, resultItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionServicesProcessimagepipelinePost200Response {\n");
    sb.append("    returnStatus: ").append(toIndentedString(returnStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    executionMilliSeconds: ").append(toIndentedString(executionMilliSeconds)).append("\n");
    sb.append("    licensePagesUsed: ").append(toIndentedString(licensePagesUsed)).append("\n");
    sb.append("    licensePagesUsed2: ").append(toIndentedString(licensePagesUsed2)).append("\n");
    sb.append("    resultItems: ").append(toIndentedString(resultItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("returnStatus");
    openapiFields.add("id");
    openapiFields.add("serviceName");
    openapiFields.add("executionMilliSeconds");
    openapiFields.add("licensePagesUsed");
    openapiFields.add("licensePagesUsed2");
    openapiFields.add("resultItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SessionServicesProcessimagepipelinePost200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SessionServicesProcessimagepipelinePost200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionServicesProcessimagepipelinePost200Response is not found in the empty JSON string", SessionServicesProcessimagepipelinePost200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SessionServicesProcessimagepipelinePost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SessionServicesProcessimagepipelinePost200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `returnStatus`
      if (jsonObj.get("returnStatus") != null && !jsonObj.get("returnStatus").isJsonNull()) {
        ReturnStatusBody.validateJsonElement(jsonObj.get("returnStatus"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("serviceName") != null && !jsonObj.get("serviceName").isJsonNull()) && !jsonObj.get("serviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceName").toString()));
      }
      if ((jsonObj.get("executionMilliSeconds") != null && !jsonObj.get("executionMilliSeconds").isJsonNull()) && !jsonObj.get("executionMilliSeconds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `executionMilliSeconds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("executionMilliSeconds").toString()));
      }
      if (jsonObj.get("resultItems") != null && !jsonObj.get("resultItems").isJsonNull()) {
        JsonArray jsonArrayresultItems = jsonObj.getAsJsonArray("resultItems");
        if (jsonArrayresultItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resultItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resultItems` to be an array in the JSON string but got `%s`", jsonObj.get("resultItems").toString()));
          }

          // validate the optional field `resultItems` (array)
          for (int i = 0; i < jsonArrayresultItems.size(); i++) {
            BasicResultItemWithValuesAndFiles.validateJsonElement(jsonArrayresultItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionServicesProcessimagepipelinePost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionServicesProcessimagepipelinePost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionServicesProcessimagepipelinePost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionServicesProcessimagepipelinePost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionServicesProcessimagepipelinePost200Response>() {
           @Override
           public void write(JsonWriter out, SessionServicesProcessimagepipelinePost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SessionServicesProcessimagepipelinePost200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SessionServicesProcessimagepipelinePost200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionServicesProcessimagepipelinePost200Response
  * @throws IOException if the JSON string is invalid with respect to SessionServicesProcessimagepipelinePost200Response
  */
  public static SessionServicesProcessimagepipelinePost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionServicesProcessimagepipelinePost200Response.class);
  }

 /**
  * Convert an instance of SessionServicesProcessimagepipelinePost200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

