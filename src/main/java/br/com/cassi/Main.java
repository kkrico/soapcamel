package br.com.cassi;

import br.com.cassi.soap.CalculadoraServerImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9876/calc",
                new CalculadoraServerImpl());
    }
}
