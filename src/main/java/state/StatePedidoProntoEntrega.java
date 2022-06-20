/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import enums.EnumPedido;

/**
 *
 * @author Davidson
 */
public class StatePedidoProntoEntrega extends StateAbstrato{

    public StatePedidoProntoEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.PRONTO_ENTREGA;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void saiuParaEntrega(){
        pedido.changeState(new StatePedidoEmRotaParaEntrega(pedido));
    }
}