/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import dao.ProdutoDAO;
import desconto.Desconto;
import imposto.Imposto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import model.ItemPedido;

/**
 *
 * @author Davidson
 */
public class Pedido {
       private StateAbstrato state;

    private Integer numero;
    private LocalDateTime data;
    private Double valorAPagar;
    private Double valorPedido;
    private Double valorDescontos;
    private Double valorImpostos;
    private ArrayList<ItemPedido> itens;
    private ArrayList<Desconto> descontos;
    private ArrayList<Imposto> impostos;
    private Integer avaliacao;

    private ProdutoDAO produtoDAO;

    public Pedido(Integer numero) {
        this.itens = new ArrayList<>();
        this.descontos = new ArrayList<>();
        this.impostos = new ArrayList<>();
        this.numero = numero;
        this.data = LocalDateTime.now();
        this.state = new StatePedidoNovo(this);
        this.produtoDAO = ProdutoDAO.getInstance();

    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    void changeState(StateAbstrato state){
        this.state = state;
    }

    public StateAbstrato getState() {
        return state;
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Double getValorAPagar() {
        return valorAPagar;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public ProdutoDAO getProdutoDAO() {
        return produtoDAO;
    }

    public void setValorAPagar(Double valorTotal) {
        this.valorAPagar = valorTotal;
    }

    public void setState(StateAbstrato state) {
        this.state = state;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void setValorDescontos(Double valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public void setValorImpostos(Double valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public Double getValorDescontos() {
        return valorDescontos;
    }

    public Double getValorImpostos() {
        return valorImpostos;
    }

    public ArrayList<Desconto> getDescontos() {
        return descontos;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }
}
