
package ws;

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
@WebServiceClient(name = "ExampleWSService", targetNamespace = "http://ws/", wsdlLocation = "https://localhost:8181/WebServiceGlassSSL/ExampleWSService?wsdl")
public class ExampleWSService
    extends Service
{

    private final static URL EXAMPLEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXAMPLEWSSERVICE_EXCEPTION;
    private final static QName EXAMPLEWSSERVICE_QNAME = new QName("http://ws/", "ExampleWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://localhost:8181/WebServiceGlassSSL/ExampleWSService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMPLEWSSERVICE_WSDL_LOCATION = url;
        EXAMPLEWSSERVICE_EXCEPTION = e;
    }

    public ExampleWSService() {
        super(__getWsdlLocation(), EXAMPLEWSSERVICE_QNAME);
    }

    public ExampleWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMPLEWSSERVICE_QNAME, features);
    }

    public ExampleWSService(URL wsdlLocation) {
        super(wsdlLocation, EXAMPLEWSSERVICE_QNAME);
    }

    public ExampleWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMPLEWSSERVICE_QNAME, features);
    }

    public ExampleWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExampleWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExampleWS
     */
    @WebEndpoint(name = "ExampleWSPort")
    public ExampleWS getExampleWSPort() {
        return super.getPort(new QName("http://ws/", "ExampleWSPort"), ExampleWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExampleWS
     */
    @WebEndpoint(name = "ExampleWSPort")
    public ExampleWS getExampleWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ExampleWSPort"), ExampleWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMPLEWSSERVICE_EXCEPTION!= null) {
            throw EXAMPLEWSSERVICE_EXCEPTION;
        }
        return EXAMPLEWSSERVICE_WSDL_LOCATION;
    }

}
