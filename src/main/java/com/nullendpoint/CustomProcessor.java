package com.nullendpoint;

import br.com.cassi.soap.CalculadoraServer;
import br.com.cassi.soap.CalculadoraServerImpl;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.springframework.stereotype.Component;

@Component("customProcessor")
public class CustomProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {


    }
}
