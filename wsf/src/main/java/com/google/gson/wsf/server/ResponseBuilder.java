/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.wsf.server;

import com.google.gson.webservice.definition.procedural.WebServiceCallSpec;
import com.google.gson.webservice.definition.procedural.WebServiceRequest;
import com.google.gson.webservice.definition.procedural.WebServiceResponse;

/**
 * An interface describing a class that can build a response
 *
 * @author inder
 */
public interface ResponseBuilder {
  public void buildResponse(WebServiceCallSpec callSpec, WebServiceRequest request,
      WebServiceResponse.Builder responseBuilder); 
}
