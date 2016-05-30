/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.api.Search;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;

import com.adobe.sign.api.SearchApi;
import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
import com.adobe.sign.model.search.AgreementAssetEventRequest;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.SearchUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Post Search API.
 */
public class PostSearchApiTest {
  
  private SearchApi searchApi = null;

  @Before
  public void setup() {
    searchApi = SearchUtils.getSearchApi();
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE,
                                                                                                      TestData.STATIC_END_DATE);
    try {
      searchApi.createAssetEvent(TestData.NULL_PARAM,
                                 agreementAssetEventRequest,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      searchApi.createAssetEvent(TestData.EMPTY_PARAM,
                                 agreementAssetEventRequest,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE,
                                                                                                      TestData.STATIC_END_DATE);
    try {
      searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                 agreementAssetEventRequest,
                                 TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint. Negative scenarios covered:
   * MISSING_REQUIRED_PARAM: null AgreementAssetEventRequest.
   * INVALID_DATE: null startDate; null endDate; endDate earlier than startDate.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementAssetEventRequest() throws ApiException {
    try {
      searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                 null,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(null,
                                                                                                      TestData.STATIC_END_DATE);
    try {
      searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                 agreementAssetEventRequest,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }

    agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE,
                                                                           null);
    try {
      searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                 agreementAssetEventRequest,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }

    Date startDate = TestData.STATIC_END_DATE;
    Date endDate = TestData.STATIC_START_DATE;

    agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(startDate,
                                                                           endDate);
    try {
      searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                 agreementAssetEventRequest,
                                 TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating a search object for agreement asset event through the createAssetEvent endpoint.
   * Case covered is successful execution of the api call.
   *
   * @throws ApiException
   */
  @Test
  public void testCreateAssetEvent() throws ApiException {
    AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE,
                                                                                                      TestData.STATIC_END_DATE);
    try {
      AgreementAssetEventPostResponse response = searchApi.createAssetEvent(TestData.ACCESS_TOKEN,
                                                                            agreementAssetEventRequest,
                                                                            TestData.X_API_HEADER);
      assertNotNull(response);
      assertNotNull(response.getSearchId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}