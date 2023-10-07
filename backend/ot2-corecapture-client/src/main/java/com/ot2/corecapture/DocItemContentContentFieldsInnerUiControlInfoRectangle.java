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

import com.ot2.JSON;

/**
 * Rectangle identified by values in the order of Left, Top, Width, and Height. All values are Pixels with a resolution of 96 dpi in both X and Y direction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-08T02:12:33.841201300+05:30[Asia/Calcutta]")
public class DocItemContentContentFieldsInnerUiControlInfoRectangle {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private Integer left;

  public static final String SERIALIZED_NAME_TOP = "top";
  @SerializedName(SERIALIZED_NAME_TOP)
  private Integer top;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public DocItemContentContentFieldsInnerUiControlInfoRectangle() {
  }

  public DocItemContentContentFieldsInnerUiControlInfoRectangle left(Integer left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @javax.annotation.Nullable
  public Integer getLeft() {
    return left;
  }


  public void setLeft(Integer left) {
    this.left = left;
  }


  public DocItemContentContentFieldsInnerUiControlInfoRectangle top(Integer top) {
    
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @javax.annotation.Nullable
  public Integer getTop() {
    return top;
  }


  public void setTop(Integer top) {
    this.top = top;
  }


  public DocItemContentContentFieldsInnerUiControlInfoRectangle width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public DocItemContentContentFieldsInnerUiControlInfoRectangle height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocItemContentContentFieldsInnerUiControlInfoRectangle docItemContentContentFieldsInnerUiControlInfoRectangle = (DocItemContentContentFieldsInnerUiControlInfoRectangle) o;
    return Objects.equals(this.left, docItemContentContentFieldsInnerUiControlInfoRectangle.left) &&
        Objects.equals(this.top, docItemContentContentFieldsInnerUiControlInfoRectangle.top) &&
        Objects.equals(this.width, docItemContentContentFieldsInnerUiControlInfoRectangle.width) &&
        Objects.equals(this.height, docItemContentContentFieldsInnerUiControlInfoRectangle.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, top, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocItemContentContentFieldsInnerUiControlInfoRectangle {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("left");
    openapiFields.add("top");
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocItemContentContentFieldsInnerUiControlInfoRectangle
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocItemContentContentFieldsInnerUiControlInfoRectangle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocItemContentContentFieldsInnerUiControlInfoRectangle is not found in the empty JSON string", DocItemContentContentFieldsInnerUiControlInfoRectangle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocItemContentContentFieldsInnerUiControlInfoRectangle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocItemContentContentFieldsInnerUiControlInfoRectangle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocItemContentContentFieldsInnerUiControlInfoRectangle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocItemContentContentFieldsInnerUiControlInfoRectangle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocItemContentContentFieldsInnerUiControlInfoRectangle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocItemContentContentFieldsInnerUiControlInfoRectangle.class));

       return (TypeAdapter<T>) new TypeAdapter<DocItemContentContentFieldsInnerUiControlInfoRectangle>() {
           @Override
           public void write(JsonWriter out, DocItemContentContentFieldsInnerUiControlInfoRectangle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocItemContentContentFieldsInnerUiControlInfoRectangle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocItemContentContentFieldsInnerUiControlInfoRectangle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocItemContentContentFieldsInnerUiControlInfoRectangle
  * @throws IOException if the JSON string is invalid with respect to DocItemContentContentFieldsInnerUiControlInfoRectangle
  */
  public static DocItemContentContentFieldsInnerUiControlInfoRectangle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocItemContentContentFieldsInnerUiControlInfoRectangle.class);
  }

 /**
  * Convert an instance of DocItemContentContentFieldsInnerUiControlInfoRectangle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

