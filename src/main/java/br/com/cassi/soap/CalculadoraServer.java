package br.com.cassi.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.BindingType;

@WebService
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CalculadoraServer {
    @WebMethod float soma(int num1, int num2);
    @WebMethod float subtracao(float num1, float num2);
    @WebMethod float multiplicacao(float num1, float num2);
    @WebMethod float divisao(float num1, float num2);
}

