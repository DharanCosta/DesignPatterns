package br.com.loja;

import br.com.loja.imposto.CalculadoraDeImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        System.out.println(calculadoraDeImposto.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImposto.calcular(orcamento,new ISS()));
    }
}
