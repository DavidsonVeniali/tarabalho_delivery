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
public class StateAguardandoPagamento extends StateAbstrato {

    public StateAguardandoPagamento(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.AGUARDANDO_PAGAMENTO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void pagar(){
        this.pedidoBaixaEstoque();
        pedido.changeState(new StatePedidoConfirmado(pedido));
    }

    void pedidoBaixaEstoque(){
        for(ItemPedido item: pedido.getItens()){
            pedido.getProdutoDAO().baixaEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }
    }

    void pedidoCancelar(){
        pedido.changeState(new StateCanceladoEstabelecimento(pedido));
    }
}