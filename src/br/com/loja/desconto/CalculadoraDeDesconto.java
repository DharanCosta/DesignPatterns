package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisCincoItens(
                new DescontoOrcamentoMaiorQue(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
