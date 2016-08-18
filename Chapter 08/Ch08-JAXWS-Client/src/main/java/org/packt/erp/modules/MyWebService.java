
package org.packt.erp.modules;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebService", targetNamespace = "http://modules.erp.packt.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MyWebService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://modules.erp.packt.org/MyWebService/printMessageRequest", output = "http://modules.erp.packt.org/MyWebService/printMessageResponse")
    public String printMessage();

}