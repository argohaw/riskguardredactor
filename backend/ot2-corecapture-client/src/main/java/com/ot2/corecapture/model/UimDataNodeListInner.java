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
import com.ot2.corecapture.model.UimDataNodeListInnerDataInner;
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
 * UimDataNodeListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-14T00:05:58.836985800+05:30[Asia/Calcutta]")
public class UimDataNodeListInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ARRAY = "isArray";
  @SerializedName(SERIALIZED_NAME_IS_ARRAY)
  private Boolean isArray;

  /**
   * Specifies the type of field. Will be one of \&quot;number\&quot;, \&quot;string\&quot;, \&quot;boolean\&quot;, \&quot;datetime\&quot;.
   */
  @JsonAdapter(IndexFieldTypeEnum.Adapter.class)
  public enum IndexFieldTypeEnum {
    NUMBER("number"),
    
    STRING("string"),
    
    BOOLEAN("boolean"),
    
    DATETIME("datetime");

    private String value;

    IndexFieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndexFieldTypeEnum fromValue(String value) {
      for (IndexFieldTypeEnum b : IndexFieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndexFieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndexFieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndexFieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndexFieldTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDEX_FIELD_TYPE = "indexFieldType";
  @SerializedName(SERIALIZED_NAME_INDEX_FIELD_TYPE)
  private IndexFieldTypeEnum indexFieldType;

  public static final String SERIALIZED_NAME_LABEL_TEXT = "labelText";
  @SerializedName(SERIALIZED_NAME_LABEL_TEXT)
  private String labelText;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  /**
   * This will be the type of UI control. Will be one of \&quot;TextBox\&quot;, \&quot;ChoiceText\&quot;, \&quot;ListBox\&quot;, \&quot;CheckBox\&quot;, \&quot;ComboBox\&quot;.
   */
  @JsonAdapter(ControlTypeEnum.Adapter.class)
  public enum ControlTypeEnum {
    TEXTBOX("TextBox"),
    
    CHOICETEXT("ChoiceText"),
    
    LISTBOX("ListBox"),
    
    CHECKBOX("CheckBox"),
    
    COMBOBOX("ComboBox");

    private String value;

    ControlTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ControlTypeEnum fromValue(String value) {
      for (ControlTypeEnum b : ControlTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ControlTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ControlTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ControlTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ControlTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTROL_TYPE = "controlType";
  @SerializedName(SERIALIZED_NAME_CONTROL_TYPE)
  private ControlTypeEnum controlType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<UimDataNodeListInnerDataInner> data;

  public UimDataNodeListInner() {
  }

  public UimDataNodeListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the field
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UimDataNodeListInner isArray(Boolean isArray) {
    
    this.isArray = isArray;
    return this;
  }

   /**
   * True if this is an array field; otherwise, false.
   * @return isArray
  **/
  @javax.annotation.Nullable
  public Boolean getIsArray() {
    return isArray;
  }


  public void setIsArray(Boolean isArray) {
    this.isArray = isArray;
  }


  public UimDataNodeListInner indexFieldType(IndexFieldTypeEnum indexFieldType) {
    
    this.indexFieldType = indexFieldType;
    return this;
  }

   /**
   * Specifies the type of field. Will be one of \&quot;number\&quot;, \&quot;string\&quot;, \&quot;boolean\&quot;, \&quot;datetime\&quot;.
   * @return indexFieldType
  **/
  @javax.annotation.Nullable
  public IndexFieldTypeEnum getIndexFieldType() {
    return indexFieldType;
  }


  public void setIndexFieldType(IndexFieldTypeEnum indexFieldType) {
    this.indexFieldType = indexFieldType;
  }


  public UimDataNodeListInner labelText(String labelText) {
    
    this.labelText = labelText;
    return this;
  }

   /**
   * The label for the field to show in the UI.
   * @return labelText
  **/
  @javax.annotation.Nullable
  public String getLabelText() {
    return labelText;
  }


  public void setLabelText(String labelText) {
    this.labelText = labelText;
  }


  public UimDataNodeListInner isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * True if this is a required field; otherwise, false.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public UimDataNodeListInner controlType(ControlTypeEnum controlType) {
    
    this.controlType = controlType;
    return this;
  }

   /**
   * This will be the type of UI control. Will be one of \&quot;TextBox\&quot;, \&quot;ChoiceText\&quot;, \&quot;ListBox\&quot;, \&quot;CheckBox\&quot;, \&quot;ComboBox\&quot;.
   * @return controlType
  **/
  @javax.annotation.Nullable
  public ControlTypeEnum getControlType() {
    return controlType;
  }


  public void setControlType(ControlTypeEnum controlType) {
    this.controlType = controlType;
  }


  public UimDataNodeListInner data(List<UimDataNodeListInnerDataInner> data) {
    
    this.data = data;
    return this;
  }

  public UimDataNodeListInner addDataItem(UimDataNodeListInnerDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains all the data for the field(s).
   * @return data
  **/
  @javax.annotation.Nullable
  public List<UimDataNodeListInnerDataInner> getData() {
    return data;
  }


  public void setData(List<UimDataNodeListInnerDataInner> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UimDataNodeListInner uimDataNodeListInner = (UimDataNodeListInner) o;
    return Objects.equals(this.name, uimDataNodeListInner.name) &&
        Objects.equals(this.isArray, uimDataNodeListInner.isArray) &&
        Objects.equals(this.indexFieldType, uimDataNodeListInner.indexFieldType) &&
        Objects.equals(this.labelText, uimDataNodeListInner.labelText) &&
        Objects.equals(this.isRequired, uimDataNodeListInner.isRequired) &&
        Objects.equals(this.controlType, uimDataNodeListInner.controlType) &&
        Objects.equals(this.data, uimDataNodeListInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isArray, indexFieldType, labelText, isRequired, controlType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UimDataNodeListInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isArray: ").append(toIndentedString(isArray)).append("\n");
    sb.append("    indexFieldType: ").append(toIndentedString(indexFieldType)).append("\n");
    sb.append("    labelText: ").append(toIndentedString(labelText)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("isArray");
    openapiFields.add("indexFieldType");
    openapiFields.add("labelText");
    openapiFields.add("isRequired");
    openapiFields.add("controlType");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UimDataNodeListInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UimDataNodeListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UimDataNodeListInner is not found in the empty JSON string", UimDataNodeListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UimDataNodeListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UimDataNodeListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("indexFieldType") != null && !jsonObj.get("indexFieldType").isJsonNull()) && !jsonObj.get("indexFieldType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexFieldType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexFieldType").toString()));
      }
      if ((jsonObj.get("labelText") != null && !jsonObj.get("labelText").isJsonNull()) && !jsonObj.get("labelText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelText").toString()));
      }
      if ((jsonObj.get("controlType") != null && !jsonObj.get("controlType").isJsonNull()) && !jsonObj.get("controlType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controlType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controlType").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            UimDataNodeListInnerDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UimDataNodeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UimDataNodeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UimDataNodeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UimDataNodeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UimDataNodeListInner>() {
           @Override
           public void write(JsonWriter out, UimDataNodeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UimDataNodeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UimDataNodeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UimDataNodeListInner
  * @throws IOException if the JSON string is invalid with respect to UimDataNodeListInner
  */
  public static UimDataNodeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UimDataNodeListInner.class);
  }

 /**
  * Convert an instance of UimDataNodeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

