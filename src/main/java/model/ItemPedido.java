/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Davidson
 */
public class ItemPedido {

    private Integer quantidade;
    private Double valorUnitario;
    private Double valorTotal;
    private Produto produto;

    public ItemPedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.valorUnitario = produto.getPrecoUnitario();
        this.valorTotal = this.calculaValortotal();
        this.produto = produto;
    }

    private Double calculaValortotal() {
        return this.valorUnitario * this.quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
