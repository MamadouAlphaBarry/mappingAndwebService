package org.sid;

import jakarta.xml.ws.Endpoint;

public class Serveur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/",new ReleveWS());
        System.out.print("Serveur listen to: http://localhost:8080/");
    }
}
