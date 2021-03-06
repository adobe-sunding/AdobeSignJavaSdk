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


package io.swagger.client.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.agreements.DocumentImageUrls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentImageUrlsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class DocumentImageUrlsInfo {
  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("documentImageUrlsList")
  private List<DocumentImageUrls> documentImageUrlsList = null;

  public DocumentImageUrlsInfo documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Id of the document
   * @return documentId
  **/
  @ApiModelProperty(value = "Id of the document")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DocumentImageUrlsInfo documentImageUrlsList(List<DocumentImageUrls> documentImageUrlsList) {
    this.documentImageUrlsList = documentImageUrlsList;
    return this;
  }

  public DocumentImageUrlsInfo addDocumentImageUrlsListItem(DocumentImageUrls documentImageUrlsListItem) {
    if (this.documentImageUrlsList == null) {
      this.documentImageUrlsList = new ArrayList<DocumentImageUrls>();
    }
    this.documentImageUrlsList.add(documentImageUrlsListItem);
    return this;
  }

   /**
   * A list of documents image URLs.
   * @return documentImageUrlsList
  **/
  @ApiModelProperty(value = "A list of documents image URLs.")
  public List<DocumentImageUrls> getDocumentImageUrlsList() {
    return documentImageUrlsList;
  }

  public void setDocumentImageUrlsList(List<DocumentImageUrls> documentImageUrlsList) {
    this.documentImageUrlsList = documentImageUrlsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentImageUrlsInfo documentImageUrlsInfo = (DocumentImageUrlsInfo) o;
    return Objects.equals(this.documentId, documentImageUrlsInfo.documentId) &&
        Objects.equals(this.documentImageUrlsList, documentImageUrlsInfo.documentImageUrlsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentImageUrlsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentImageUrlsInfo {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentImageUrlsList: ").append(toIndentedString(documentImageUrlsList)).append("\n");
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

