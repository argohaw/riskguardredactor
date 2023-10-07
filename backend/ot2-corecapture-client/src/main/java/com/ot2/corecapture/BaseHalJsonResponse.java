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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ot2.corecapture.ResourceLinks;
import com.ot2.corecapture.ReturnStatusBody;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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

import com.ot2.JSON;

/**
 * BaseHalJsonResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-08T02:12:33.841201300+05:30[Asia/Calcutta]")
public class BaseHalJsonResponse {
  public static final String SERIALIZED_NAME_RETURN_STATUS = "returnStatus";
  @SerializedName(SERIALIZED_NAME_RETURN_STATUS)
  private ReturnStatusBody returnStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ResourceLinks links;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public BaseHalJsonResponse() {
  }

  public BaseHalJsonResponse returnStatus(ReturnStatusBody returnStatus) {
    
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


  public BaseHalJsonResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Feed or Entry instance identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BaseHalJsonResponse title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Simple localized title for the feed.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BaseHalJsonResponse links(ResourceLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public ResourceLinks getLinks() {
    return links;
  }


  public void setLinks(ResourceLinks links) {
    this.links = links;
  }


  public BaseHalJsonResponse updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Feed or Entry date in UTC in ISO 8601 (e.g. 2006-04-17T21:22:48.2698750Z)
   * @return updated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseHalJsonResponse baseHalJsonResponse = (BaseHalJsonResponse) o;
    return Objects.equals(this.returnStatus, baseHalJsonResponse.returnStatus) &&
        Objects.equals(this.id, baseHalJsonResponse.id) &&
        Objects.equals(this.title, baseHalJsonResponse.title) &&
        Objects.equals(this.links, baseHalJsonResponse.links) &&
        Objects.equals(this.updated, baseHalJsonResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnStatus, id, title, links, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseHalJsonResponse {\n");
    sb.append("    returnStatus: ").append(toIndentedString(returnStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("_links");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BaseHalJsonResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BaseHalJsonResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BaseHalJsonResponse is not found in the empty JSON string", BaseHalJsonResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BaseHalJsonResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BaseHalJsonResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        ResourceLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BaseHalJsonResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BaseHalJsonResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BaseHalJsonResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BaseHalJsonResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BaseHalJsonResponse>() {
           @Override
           public void write(JsonWriter out, BaseHalJsonResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BaseHalJsonResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BaseHalJsonResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BaseHalJsonResponse
  * @throws IOException if the JSON string is invalid with respect to BaseHalJsonResponse
  */
  public static BaseHalJsonResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseHalJsonResponse.class);
  }

 /**
  * Convert an instance of BaseHalJsonResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

