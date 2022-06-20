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
public class StateCanceladoPedido extends StateAbstrato{

    public StateCanceladoPedido(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.CANCELADO_CLIENTE;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void reembolsarPedido(){

        pedido.setValorAPagar(0.0);
        pedido.setValorPedido(0.0);
        pedido.setValorDescontos(0.0);
        pedido.setValorImpostos(0.0);

        this.pedidoBaixaEstoque();
        pedido.changeState(new StateReembolsado(pedido));
    }

    void pedidoBaixaEstoque(){
        for(ItemPedido item: pedido.getItens()){
            pedido.getProdutoDAO().adicionaEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }
    }
}
