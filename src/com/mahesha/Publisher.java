package com.mahesha;

import javax.xml.ws.Endpoint;
//Endpoint publisher
public class Publisher{
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
    }
}
