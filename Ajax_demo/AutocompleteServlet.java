/**
 * Copyright 2005 Darren L. Spurgeon
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
package org.ajaxtags.demo.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ajaxtags.demo.CarService;
import org.ajaxtags.helpers.AjaxXmlBuilder;
import org.ajaxtags.servlets.BaseAjaxServlet;

/**
 * An example servlet that responds to an ajax:autocomplete tag action. This servlet would be
 * referenced by the baseUrl attribute of the JSP tag.
 * <p>
 * This servlet should generate XML in the following format:
 * </p>
 * <code><![CDATA[<?xml version="1.0"?>
 * <list>
 *   <item value="Item1">First Item</item>
 *   <item value="Item2">Second Item</item>
 *   <item value="Item3">Third Item</item>
 * </list>]]></code>
 * 
 * @author Darren L. Spurgeon
 * @version $Revision: 1.1 $ $Date: 2006-12-11 03:11:32 $
 */
public class AutocompleteServlet extends BaseAjaxServlet {

  /**
   * @see org.ajaxtags.demo.servlet.BaseAjaxServlet#getXmlContent(javax.servlet.http.HttpServletRequest,
   *      javax.servlet.http.HttpServletResponse)
   */
  public String getXmlContent(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    String model = request.getParameter("model");
    CarService service = new CarService();
    List list = service.getModelsByName(model);

    // Create xml schema
    return new AjaxXmlBuilder().addItems(list, "model", "make").toString();
  }

}
