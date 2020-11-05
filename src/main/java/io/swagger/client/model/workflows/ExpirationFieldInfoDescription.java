/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.workflows;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExpirationFieldInfoDescription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T13:23:59.041+11:00")
public class ExpirationFieldInfoDescription {
  @SerializedName("maxDays")
  private Integer maxDays = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("editable")
  private Boolean editable = null;

  @SerializedName("required")
  private Boolean required = null;

  public ExpirationFieldInfoDescription maxDays(Integer maxDays) {
    this.maxDays = maxDays;
    return this;
  }

   /**
   * Maximum number of days for agreement expiration
   * @return maxDays
  **/
  @ApiModelProperty(value = "Maximum number of days for agreement expiration")
  public Integer getMaxDays() {
    return maxDays;
  }

  public void setMaxDays(Integer maxDays) {
    this.maxDays = maxDays;
  }

  public ExpirationFieldInfoDescription visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user
   * @return visible
  **/
  @ApiModelProperty(value = "Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public ExpirationFieldInfoDescription defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * default value of the field if input for this field is not provided and this field is required
   * @return defaultValue
  **/
  @ApiModelProperty(value = "default value of the field if input for this field is not provided and this field is required")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ExpirationFieldInfoDescription editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation
   * @return editable
  **/
  @ApiModelProperty(value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ExpirationFieldInfoDescription required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether this field is required or optional
   * @return required
  **/
  @ApiModelProperty(value = "Whether this field is required or optional")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpirationFieldInfoDescription expirationFieldInfoDescription = (ExpirationFieldInfoDescription) o;
    return Objects.equals(this.maxDays, expirationFieldInfoDescription.maxDays) &&
        Objects.equals(this.visible, expirationFieldInfoDescription.visible) &&
        Objects.equals(this.defaultValue, expirationFieldInfoDescription.defaultValue) &&
        Objects.equals(this.editable, expirationFieldInfoDescription.editable) &&
        Objects.equals(this.required, expirationFieldInfoDescription.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDays, visible, defaultValue, editable, required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpirationFieldInfoDescription {\n");
    
    sb.append("    maxDays: ").append(toIndentedString(maxDays)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
