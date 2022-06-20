/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import desconto.Desconto;
import enums.EnumPedido;
import imposto.Imposto;
import model.ItemPedido;

/**
 *
 * @author Davidson
 */
public class StatePedidoNovo extends StateAbstrato {

    StatePedidoNovo(Pedido pedido) {
        super(pedido);
    }

    @Override
    EnumPedido getStatus() {
        return EnumPedido.NOVO;
    }

    @Override
    Pedido getPedido() {
        return this.pedido;
    }

    void inserirItem(ItemPedido item) {
        pedido.getItens().add(item);
    }

    void removerItem(ItemPedido item) {
        pedido.getItens().remove(item);
    }

    void PedidoConcluido() {
        this.calculaTotal();
        this.calculaTotalDeImpostos();
        this.calcularTotalDeDescontos();
        pedido.changeState(new StateAguardandoPagamento(pedido));
    }

    void calculaTotal() {
        Double total = 0.0;

        try {
            for(ItemPedido item: pedido.getItens()){
                if (item.getQuantidade() > 0){
                    item.setValorTotal(item.getValorUnitario() * item.getQuantidade());
                    total += item.getValorTotal();
                }
            }

            if (total > 0){
                pedido.setValorPedido(total);
            }
        } catch (RuntimeException ex) {
            throw (ex);
        }
    }

    void calculaTotalDeImpostos() {
        Double total = 0.0;

        for(Imposto imposto: pedido.getImpostos()){
            imposto.setValor(pedido.getValorPedido() * imposto.getPercentual());
            pedido.setValorAPagar(pedido.getValorPedido() + imposto.getValor());
        }

    }

    void calcularTotalDeDescontos(){
        Double total = 0.0;

        for(Desconto desconto: pedido.getDescontos()){
            desconto.setValorDesconto(pedido.getValorPedido() * desconto.getPercentual());
            pedido.setValorAPagar(pedido.getValorPedido() - desconto.getValorDesconto());
        }
    }

    void pedidoCancelar() {
        pedido.changeState(new StateCanceladoPedido(pedido));
    }
}
