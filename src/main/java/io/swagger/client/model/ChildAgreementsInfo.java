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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MegaSignChildAgreementsFileInfo;
import java.io.IOException;

/**
 * ChildAgreementsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:25.254+05:30")
public class ChildAgreementsInfo {
  @SerializedName("fileInfo")
  private MegaSignChildAgreementsFileInfo fileInfo = null;

  public ChildAgreementsInfo fileInfo(MegaSignChildAgreementsFileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * File info containing per child agreement information of megaSign.
   * @return fileInfo
  **/
  @ApiModelProperty(value = "File info containing per child agreement information of megaSign.")
  public MegaSignChildAgreementsFileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(MegaSignChildAgreementsFileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildAgreementsInfo childAgreementsInfo = (ChildAgreementsInfo) o;
    return Objects.equals(this.fileInfo, childAgreementsInfo.fileInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildAgreementsInfo {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
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
