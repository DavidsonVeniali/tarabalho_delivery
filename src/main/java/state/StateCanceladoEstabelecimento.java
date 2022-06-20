/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import enums.EnumPedido;
import model.ItemPedido;

/**
 *
 * @author Davidson
 */
public class StateCanceladoEstabelecimento extends StateAbstrato {

    public StateCanceladoEstabelecimento(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.CANCELADO_ESTABELECIMENTO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void reembolsar() {

        pedido.setValorAPagar(0.0);
        pedido.setValorPedido(0.0);
        pedido.setValorDescontos(0.0);
        pedido.setValorImpostos(0.0);

        this.baixaEstoque();
        pedido.changeState(new StateReembolsado(pedido));
    }

    void baixaEstoque() {
        for (ItemPedido item : pedido.getItens()) {
            pedido.getProdutoDAO().adicionaEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }
    }
}
