package br.com.cassi.soap;

import javax.jws.WebService;


@WebService(endpointInterface = "br.com.cassi.soap.CalculadoraServer", name = "Calculadora", serviceName = "CalculadoraSOAPService")
public class CalculadoraServerImpl implements CalculadoraServer {

    public float soma(int num1, int num2) {
        return num1 + num2;
    }

    public float subtracao(float num1, float num2) {
        return num1 - num2;
    }

    public float multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

    public float divisao(float num1, float num2) {
        return num1 / num2;
    }

}