package br.com.loja;

import br.com.loja.desconto.CalculadoraDeDesconto;
import br.com.loja.imposto.CalculadoraDeImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        System.out.println(calculadoraDeDesconto.calcular(orcamento));
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
    }
}
