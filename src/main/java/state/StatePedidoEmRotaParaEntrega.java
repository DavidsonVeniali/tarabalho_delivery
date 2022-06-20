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
public class StatePedidoEmRotaParaEntrega extends StateAbstrato{

    public StatePedidoEmRotaParaEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.EM_ROTA_ENTREGA;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void PedidoEntregue(){
        pedido.changeState(new StateEntregue(pedido));
    }
}

