/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


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


package io.swagger.client.model.megaSigns;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.megaSigns.ChildAgreementsInfo;
import io.swagger.client.model.megaSigns.ExternalId;
import io.swagger.client.model.megaSigns.FileInfo;
import io.swagger.client.model.megaSigns.MegaSignCcInfo;
import io.swagger.client.model.megaSigns.MegaSignSecurityOption;
import io.swagger.client.model.megaSigns.PostSignOption;
import io.swagger.client.model.megaSigns.VaultingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * MegaSignCreationInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:16.276+05:30")
public class MegaSignCreationInfo {
  @SerializedName("ccs")
  private List<MegaSignCcInfo> ccs = null;

  @SerializedName("childAgreementsInfo")
  private ChildAgreementsInfo childAgreementsInfo = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("expirationTime")
  private Date expirationTime = null;

  @SerializedName("externalId")
  private ExternalId externalId = null;

  @SerializedName("fileInfos")
  private List<FileInfo> fileInfos = null;

  @SerializedName("firstReminderDelay")
  private Integer firstReminderDelay = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("postSignOption")
  private PostSignOption postSignOption = null;

  /**
   * Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used
   */
  @JsonAdapter(ReminderFrequencyEnum.Adapter.class)
  public enum ReminderFrequencyEnum {
    DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"),
    
    WEEKDAILY_UNTIL_SIGNED("WEEKDAILY_UNTIL_SIGNED"),
    
    EVERY_OTHER_DAY_UNTIL_SIGNED("EVERY_OTHER_DAY_UNTIL_SIGNED"),
    
    EVERY_THIRD_DAY_UNTIL_SIGNED("EVERY_THIRD_DAY_UNTIL_SIGNED"),
    
    EVERY_FIFTH_DAY_UNTIL_SIGNED("EVERY_FIFTH_DAY_UNTIL_SIGNED"),
    
    WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED");

    private String value;

    ReminderFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReminderFrequencyEnum fromValue(String text) {
      for (ReminderFrequencyEnum b : ReminderFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReminderFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReminderFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReminderFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReminderFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reminderFrequency")
  private ReminderFrequencyEnum reminderFrequency = null;

  @SerializedName("securityOption")
  private MegaSignSecurityOption securityOption = null;

  @SerializedName("senderEmail")
  private String senderEmail = null;

  /**
   * Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system
   */
  @JsonAdapter(SignatureTypeEnum.Adapter.class)
  public enum SignatureTypeEnum {
    ESIGN("ESIGN"),
    
    WRITTEN("WRITTEN");

    private String value;

    SignatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureTypeEnum fromValue(String text) {
      for (SignatureTypeEnum b : SignatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureType")
  private SignatureTypeEnum signatureType = null;

  /**
   * State of the Megasign
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROCESS("IN_PROCESS");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  /**
   * Status of the Megasign
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORING("AUTHORING"),
    
    IN_PROCESS("IN_PROCESS"),
    
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED"),
    
    EXPIRED("EXPIRED"),
    
    PREFILL("PREFILL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("vaultingInfo")
  private VaultingInfo vaultingInfo = null;

  public MegaSignCreationInfo ccs(List<MegaSignCcInfo> ccs) {
    this.ccs = ccs;
    return this;
  }

  public MegaSignCreationInfo addCcsItem(MegaSignCcInfo ccsItem) {
    if (this.ccs == null) {
      this.ccs = new ArrayList<MegaSignCcInfo>();
    }
    this.ccs.add(ccsItem);
    return this;
  }

   /**
   * A list of one or more CCs that will be copied in the megasign transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file 
   * @return ccs
  **/
  @ApiModelProperty(value = "A list of one or more CCs that will be copied in the megasign transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file ")
  public List<MegaSignCcInfo> getCcs() {
    return ccs;
  }

  public void setCcs(List<MegaSignCcInfo> ccs) {
    this.ccs = ccs;
  }

  public MegaSignCreationInfo childAgreementsInfo(ChildAgreementsInfo childAgreementsInfo) {
    this.childAgreementsInfo = childAgreementsInfo;
    return this;
  }

   /**
   * Info corresponding to each child agreement of the megaSign 
   * @return childAgreementsInfo
  **/
  @ApiModelProperty(value = "Info corresponding to each child agreement of the megaSign ")
  public ChildAgreementsInfo getChildAgreementsInfo() {
    return childAgreementsInfo;
  }

  public void setChildAgreementsInfo(ChildAgreementsInfo childAgreementsInfo) {
    this.childAgreementsInfo = childAgreementsInfo;
  }

  public MegaSignCreationInfo createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when megasign was created. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date when megasign was created. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public MegaSignCreationInfo expirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation.
   * @return expirationTime
  **/
  @ApiModelProperty(value = "Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation.")
  public Date getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
  }

  public MegaSignCreationInfo externalId(ExternalId externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * An arbitrary value from your system, which can be specified at sending time and then later returned or queried
   * @return externalId
  **/
  @ApiModelProperty(value = "An arbitrary value from your system, which can be specified at sending time and then later returned or queried")
  public ExternalId getExternalId() {
    return externalId;
  }

  public void setExternalId(ExternalId externalId) {
    this.externalId = externalId;
  }

  public MegaSignCreationInfo fileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
    return this;
  }

  public MegaSignCreationInfo addFileInfosItem(FileInfo fileInfosItem) {
    if (this.fileInfos == null) {
      this.fileInfos = new ArrayList<FileInfo>();
    }
    this.fileInfos.add(fileInfosItem);
    return this;
  }

   /**
   * A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified
   * @return fileInfos
  **/
  @ApiModelProperty(value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
  public List<FileInfo> getFileInfos() {
    return fileInfos;
  }

  public void setFileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  public MegaSignCreationInfo firstReminderDelay(Integer firstReminderDelay) {
    this.firstReminderDelay = firstReminderDelay;
    return this;
  }

   /**
   * Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Cannot be updated in a PUT
   * @return firstReminderDelay
  **/
  @ApiModelProperty(value = "Integer which specifies the delay in hours before sending the first reminder.<br>This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.<br>If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.<br>i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Cannot be updated in a PUT")
  public Integer getFirstReminderDelay() {
    return firstReminderDelay;
  }

  public void setFirstReminderDelay(Integer firstReminderDelay) {
    this.firstReminderDelay = firstReminderDelay;
  }

  public MegaSignCreationInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of megasign 
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of megasign ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MegaSignCreationInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender
   * @return locale
  **/
  @ApiModelProperty(value = "The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public MegaSignCreationInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * An optional message to the participants, describing what is being sent or why their signature is required
   * @return message
  **/
  @ApiModelProperty(value = "An optional message to the participants, describing what is being sent or why their signature is required")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MegaSignCreationInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the agreement that will be used to identify it, in emails, website and other places
   * @return name
  **/
  @ApiModelProperty(value = "The name of the agreement that will be used to identify it, in emails, website and other places")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MegaSignCreationInfo postSignOption(PostSignOption postSignOption) {
    this.postSignOption = postSignOption;
    return this;
  }

   /**
   * URL and associated properties for the success page the user will be taken to after completing the signing process
   * @return postSignOption
  **/
  @ApiModelProperty(value = "URL and associated properties for the success page the user will be taken to after completing the signing process")
  public PostSignOption getPostSignOption() {
    return postSignOption;
  }

  public void setPostSignOption(PostSignOption postSignOption) {
    this.postSignOption = postSignOption;
  }

  public MegaSignCreationInfo reminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

   /**
   * Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used
   * @return reminderFrequency
  **/
  @ApiModelProperty(value = "Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used")
  public ReminderFrequencyEnum getReminderFrequency() {
    return reminderFrequency;
  }

  public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  public MegaSignCreationInfo securityOption(MegaSignSecurityOption securityOption) {
    this.securityOption = securityOption;
    return this;
  }

   /**
   * Optional security parameters for the megasign
   * @return securityOption
  **/
  @ApiModelProperty(value = "Optional security parameters for the megasign")
  public MegaSignSecurityOption getSecurityOption() {
    return securityOption;
  }

  public void setSecurityOption(MegaSignSecurityOption securityOption) {
    this.securityOption = securityOption;
  }

  public MegaSignCreationInfo senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored
   * @return senderEmail
  **/
  @ApiModelProperty(value = "Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public MegaSignCreationInfo signatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system
   * @return signatureType
  **/
  @ApiModelProperty(value = "Specifies the type of signature you would like to request - written or e-signature. The possible values are <br> ESIGN : Agreement needs to be signed electronically <br>, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  public MegaSignCreationInfo state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of the Megasign
   * @return state
  **/
  @ApiModelProperty(value = "State of the Megasign")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public MegaSignCreationInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Megasign
   * @return status
  **/
  @ApiModelProperty(value = "Status of the Megasign")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MegaSignCreationInfo vaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
    return this;
  }

   /**
   * Vaulting properties that allows Adobe Sign to securely store documents with a vault provider
   * @return vaultingInfo
  **/
  @ApiModelProperty(value = "Vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
  public VaultingInfo getVaultingInfo() {
    return vaultingInfo;
  }

  public void setVaultingInfo(VaultingInfo vaultingInfo) {
    this.vaultingInfo = vaultingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegaSignCreationInfo megaSignCreationInfo = (MegaSignCreationInfo) o;
    return Objects.equals(this.ccs, megaSignCreationInfo.ccs) &&
        Objects.equals(this.childAgreementsInfo, megaSignCreationInfo.childAgreementsInfo) &&
        Objects.equals(this.createdDate, megaSignCreationInfo.createdDate) &&
        Objects.equals(this.expirationTime, megaSignCreationInfo.expirationTime) &&
        Objects.equals(this.externalId, megaSignCreationInfo.externalId) &&
        Objects.equals(this.fileInfos, megaSignCreationInfo.fileInfos) &&
        Objects.equals(this.firstReminderDelay, megaSignCreationInfo.firstReminderDelay) &&
        Objects.equals(this.id, megaSignCreationInfo.id) &&
        Objects.equals(this.locale, megaSignCreationInfo.locale) &&
        Objects.equals(this.message, megaSignCreationInfo.message) &&
        Objects.equals(this.name, megaSignCreationInfo.name) &&
        Objects.equals(this.postSignOption, megaSignCreationInfo.postSignOption) &&
        Objects.equals(this.reminderFrequency, megaSignCreationInfo.reminderFrequency) &&
        Objects.equals(this.securityOption, megaSignCreationInfo.securityOption) &&
        Objects.equals(this.senderEmail, megaSignCreationInfo.senderEmail) &&
        Objects.equals(this.signatureType, megaSignCreationInfo.signatureType) &&
        Objects.equals(this.state, megaSignCreationInfo.state) &&
        Objects.equals(this.status, megaSignCreationInfo.status) &&
        Objects.equals(this.vaultingInfo, megaSignCreationInfo.vaultingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccs, childAgreementsInfo, createdDate, expirationTime, externalId, fileInfos, firstReminderDelay, id, locale, message, name, postSignOption, reminderFrequency, securityOption, senderEmail, signatureType, state, status, vaultingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSignCreationInfo {\n");
    
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    childAgreementsInfo: ").append(toIndentedString(childAgreementsInfo)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fileInfos: ").append(toIndentedString(fileInfos)).append("\n");
    sb.append("    firstReminderDelay: ").append(toIndentedString(firstReminderDelay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postSignOption: ").append(toIndentedString(postSignOption)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
    sb.append("    securityOption: ").append(toIndentedString(securityOption)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vaultingInfo: ").append(toIndentedString(vaultingInfo)).append("\n");
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

