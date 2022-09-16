package br.com.loja.pedido;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //construtor com injeção de dependencias: repository,service, etc

    private List<AcaoPosGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoPosGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

//        EnviarEmailPedido email = new EnviarEmailPedido();
//        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
//
//        email.executar(pedido);
//        salvar.executar(pedido);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
