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
public class StatePedidoConfirmado extends StateAbstrato {

    public StatePedidoConfirmado(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.CONFIRMADO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void prepararPedido() {
        pedido.changeState(new StatePedidoProntoEntrega(pedido));
    }

    void pedidoCancelar() {
        pedido.changeState(new StateCanceladoEstabelecimento(pedido));
    }
}
