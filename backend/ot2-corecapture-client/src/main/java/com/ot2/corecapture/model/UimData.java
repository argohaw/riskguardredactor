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
import com.ot2.corecapture.model.UimDataNodeListInner;
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
 * The UIM data information object is returned by some Real-Time Services. This object contains information about the Document Type associated with a set of one or more images along with the data for the fields. This object is defined as follows.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T00:05:58.836985800+05:30[Asia/Calcutta]")
public class UimData {
  public static final String SERIALIZED_NAME_DOC_TYPE = "docType";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_FLAGGED_REASON = "flaggedReason";
  @SerializedName(SERIALIZED_NAME_FLAGGED_REASON)
  private String flaggedReason;

  public static final String SERIALIZED_NAME_EXTRACTION_ID = "extractionId";
  @SerializedName(SERIALIZED_NAME_EXTRACTION_ID)
  private String extractionId;

  public static final String SERIALIZED_NAME_NODE_LIST = "nodeList";
  @SerializedName(SERIALIZED_NAME_NODE_LIST)
  private List<UimDataNodeListInner> nodeList;

  public UimData() {
  }

  public UimData docType(String docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * The name of the document type.
   * @return docType
  **/
  @javax.annotation.Nullable
  public String getDocType() {
    return docType;
  }


  public void setDocType(String docType) {
    this.docType = docType;
  }


  public UimData locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * The culture code
   * @return locale
  **/
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public UimData flaggedReason(String flaggedReason) {
    
    this.flaggedReason = flaggedReason;
    return this;
  }

   /**
   * Specifies the reason for the validation error. This will only be filled on \&quot;Populate\&quot; and \&quot;PopulateAndValidate\&quot; commands if there is an error. Otherwise, it is null.
   * @return flaggedReason
  **/
  @javax.annotation.Nullable
  public String getFlaggedReason() {
    return flaggedReason;
  }


  public void setFlaggedReason(String flaggedReason) {
    this.flaggedReason = flaggedReason;
  }


  public UimData extractionId(String extractionId) {
    
    this.extractionId = extractionId;
    return this;
  }

   /**
   * A ID generated by the server during document (not page) extraction that is used when learning to extract documents with the \&quot;InformationExtraction\&quot; project.
   * @return extractionId
  **/
  @javax.annotation.Nullable
  public String getExtractionId() {
    return extractionId;
  }


  public void setExtractionId(String extractionId) {
    this.extractionId = extractionId;
  }


  public UimData nodeList(List<UimDataNodeListInner> nodeList) {
    
    this.nodeList = nodeList;
    return this;
  }

  public UimData addNodeListItem(UimDataNodeListInner nodeListItem) {
    if (this.nodeList == null) {
      this.nodeList = new ArrayList<>();
    }
    this.nodeList.add(nodeListItem);
    return this;
  }

   /**
   * Get nodeList
   * @return nodeList
  **/
  @javax.annotation.Nullable
  public List<UimDataNodeListInner> getNodeList() {
    return nodeList;
  }


  public void setNodeList(List<UimDataNodeListInner> nodeList) {
    this.nodeList = nodeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UimData uimData = (UimData) o;
    return Objects.equals(this.docType, uimData.docType) &&
        Objects.equals(this.locale, uimData.locale) &&
        Objects.equals(this.flaggedReason, uimData.flaggedReason) &&
        Objects.equals(this.extractionId, uimData.extractionId) &&
        Objects.equals(this.nodeList, uimData.nodeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docType, locale, flaggedReason, extractionId, nodeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UimData {\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    extractionId: ").append(toIndentedString(extractionId)).append("\n");
    sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
    openapiFields.add("docType");
    openapiFields.add("locale");
    openapiFields.add("flaggedReason");
    openapiFields.add("extractionId");
    openapiFields.add("nodeList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UimData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UimData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UimData is not found in the empty JSON string", UimData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UimData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UimData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("docType") != null && !jsonObj.get("docType").isJsonNull()) && !jsonObj.get("docType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docType").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("flaggedReason") != null && !jsonObj.get("flaggedReason").isJsonNull()) && !jsonObj.get("flaggedReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flaggedReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flaggedReason").toString()));
      }
      if ((jsonObj.get("extractionId") != null && !jsonObj.get("extractionId").isJsonNull()) && !jsonObj.get("extractionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extractionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extractionId").toString()));
      }
      if (jsonObj.get("nodeList") != null && !jsonObj.get("nodeList").isJsonNull()) {
        JsonArray jsonArraynodeList = jsonObj.getAsJsonArray("nodeList");
        if (jsonArraynodeList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodeList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodeList` to be an array in the JSON string but got `%s`", jsonObj.get("nodeList").toString()));
          }

          // validate the optional field `nodeList` (array)
          for (int i = 0; i < jsonArraynodeList.size(); i++) {
            UimDataNodeListInner.validateJsonElement(jsonArraynodeList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UimData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UimData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UimData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UimData.class));

       return (TypeAdapter<T>) new TypeAdapter<UimData>() {
           @Override
           public void write(JsonWriter out, UimData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UimData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UimData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UimData
  * @throws IOException if the JSON string is invalid with respect to UimData
  */
  public static UimData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UimData.class);
  }

 /**
  * Convert an instance of UimData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

