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
public class StateReembolsado extends StateAbstrato {

    public StateReembolsado(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.REEMBOLSADO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    public void AnalisarPedido(Integer nota){
        this.pedido.setAvaliacao(nota);
    }
}

