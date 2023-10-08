/*
 * Magellan Risk Guard
 * The Magellan Risk Guard REST service processes documents to help identify risks/threats. It is a completely stateless service that offers built-in accurate models. Leveraging the core components of Magellan Text Mining, the following information will be identified/extracted from documents  :  - PII(Personally Identifiable Information)  - Personal Secure Information (PSI)  - Hate Speech Classification  - Classification of images for threat/risk detection.  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ot2.riskguard.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ot2.riskguard.model.Header;
import com.ot2.riskguard.model.Results;
import java.io.IOException;
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

import com.ot2.riskguard.invoker.JSON;

/**
 * ContentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-08T02:52:58.656712200+05:30[Asia/Calcutta]")
public class ContentResponse {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private Results results;

  public ContentResponse() {
  }

  public ContentResponse header(Header header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  public Header getHeader() {
    return header;
  }


  public void setHeader(Header header) {
    this.header = header;
  }


  public ContentResponse results(Results results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public Results getResults() {
    return results;
  }


  public void setResults(Results results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentResponse contentResponse = (ContentResponse) o;
    return Objects.equals(this.header, contentResponse.header) &&
        Objects.equals(this.results, contentResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentResponse {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("header");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContentResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContentResponse is not found in the empty JSON string", ContentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `header`
      if (jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) {
        Header.validateJsonElement(jsonObj.get("header"));
      }
      // validate the optional field `results`
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        Results.validateJsonElement(jsonObj.get("results"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ContentResponse>() {
           @Override
           public void write(JsonWriter out, ContentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentResponse
  * @throws IOException if the JSON string is invalid with respect to ContentResponse
  */
  public static ContentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentResponse.class);
  }

 /**
  * Convert an instance of ContentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
