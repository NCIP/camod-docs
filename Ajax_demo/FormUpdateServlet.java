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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ajaxtags.helpers.AjaxXmlBuilder;
import org.ajaxtags.servlets.BaseAjaxServlet;

/**
 * An example servlet that responds to an ajax:updateField tag action. This servlet would be
 * referenced by the baseUrl attribute of the JSP tag.
 * 
 * @author Darren L. Spurgeon
 * @version $Revision: 1.1 $ $Date: 2006-12-11 03:11:32 $
 */
public class FormUpdateServlet extends BaseAjaxServlet {

  public static final double MPH_TO_KPH = 1.609344;

  public static final double MPH_TO_MPS = 0.44704;

  /**
   * @see org.ajaxtags.demo.servlet.BaseAjaxServlet#getXmlContent(javax.servlet.http.HttpServletRequest,
   *      javax.servlet.http.HttpServletResponse)
   */
  public String getXmlContent(HttpServletRequest request, HttpServletResponse response) {
    double mph = 0, kph = 0, mps = 0;
    mph = Double.parseDouble(request.getParameter("mph"));

    kph = mph * MPH_TO_KPH;
    mps = mph * MPH_TO_MPS;

    return new AjaxXmlBuilder()
        .addItem("kph", Double.toString(kph))
        .addItem("mps", Double.toString(mps))
        .toString();
  }

}
