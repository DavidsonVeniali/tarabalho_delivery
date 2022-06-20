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
public abstract class StateAbstrato {
    Pedido pedido;

    StateAbstrato(Pedido pedido){
        this.pedido = pedido;
    }

    abstract EnumPedido getStatus();
    abstract Pedido getPedido();

}
