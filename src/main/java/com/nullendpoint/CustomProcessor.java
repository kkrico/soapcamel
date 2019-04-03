package com.nullendpoint;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("customProcessor")
public class CustomProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Exchange e = exchange;
    }
}
