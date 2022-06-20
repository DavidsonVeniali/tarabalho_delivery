/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author Davidson
 */
public enum EnumPedido {

    NOVO("Novo"),
    AGUARDANDO_PAGAMENTO("Aguardando o pagamento"),
    CONFIRMADO("Confirmado"),
    PRONTO_ENTREGA("Pronto para ser entregue"),
    EM_ROTA_ENTREGA("Em rota da sua residência"),
    ENTREGUE("Entregue"),
    CANCELADO_CLIENTE("Pedido cancelado pelo cliente"),
    CANCELADO_ESTABELECIMENTO("Pedido cancelado pelo estabelecimento"),
    REEMBOLSADO("Reembolsado");

    private String descricao;

    EnumPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
