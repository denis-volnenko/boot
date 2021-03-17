package ru.volnenko.boot;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.UUID;

/**
 * Hello world!
 *
 */

@WebService
public class App {

    @WebMethod
    public String uuid() {
        return UUID.randomUUID().toString();
    }

    public static void main( String[] args ) {
        final String wsdl = "http://0.0.0.0:8080/App?wsdl";
        System.out.println(wsdl);
        Endpoint.publish(wsdl, new App());
    }

}
