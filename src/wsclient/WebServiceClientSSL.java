/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclient;

import java.util.Map;
import javax.xml.ws.BindingProvider;
import ws.ExampleWS;
import ws.ExampleWSService;

/**
 *
 * @author tomek.buslowski
 */
public class WebServiceClientSSL {

    public static void main(String[] args) {
        System.setProperty("javax.net.ssl.trustStore", "./client/client_cacerts.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

        ExampleWSService service = new ExampleWSService();
        ExampleWS port = service.getExampleWSPort();

        BindingProvider bindProv = (BindingProvider) port;
        Map<String, Object> context = bindProv.getRequestContext();
        context.put("javax.xml.ws.security.auth.username", "peter");
        context.put("javax.xml.ws.security.auth.password", "qwerty1");

        String response = port.greet("Tomek");
        System.out.println( response );
    }

}
