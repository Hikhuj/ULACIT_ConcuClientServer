
package com.wsliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_Conversiones", targetNamespace = "http://ws.com/", wsdlLocation = "http://localhost:8080/Lec09/WS_Conversiones?wsdl")
public class WSConversiones_Service
    extends Service
{

    private final static URL WSCONVERSIONES_WSDL_LOCATION;
    private final static WebServiceException WSCONVERSIONES_EXCEPTION;
    private final static QName WSCONVERSIONES_QNAME = new QName("http://ws.com/", "WS_Conversiones");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Lec09/WS_Conversiones?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCONVERSIONES_WSDL_LOCATION = url;
        WSCONVERSIONES_EXCEPTION = e;
    }

    public WSConversiones_Service() {
        super(__getWsdlLocation(), WSCONVERSIONES_QNAME);
    }

    public WSConversiones_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCONVERSIONES_QNAME, features);
    }

    public WSConversiones_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCONVERSIONES_QNAME);
    }

    public WSConversiones_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCONVERSIONES_QNAME, features);
    }

    public WSConversiones_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSConversiones_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSConversiones
     */
    @WebEndpoint(name = "WS_ConversionesPort")
    public WSConversiones getWSConversionesPort() {
        return super.getPort(new QName("http://ws.com/", "WS_ConversionesPort"), WSConversiones.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSConversiones
     */
    @WebEndpoint(name = "WS_ConversionesPort")
    public WSConversiones getWSConversionesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.com/", "WS_ConversionesPort"), WSConversiones.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCONVERSIONES_EXCEPTION!= null) {
            throw WSCONVERSIONES_EXCEPTION;
        }
        return WSCONVERSIONES_WSDL_LOCATION;
    }

}