/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Davidson
 */
public class Produto {

    private Integer codigo;
    private String nome;
    private Integer quantidadeEmEstoque;
    private Double precoUnitario;

    public Produto(Integer codigo, String nome, Integer quantidadeEmEstoque, Double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.precoUnitario = precoUnitario;
    }

    public void decrementaEstoque(int quantidade) {
        this.quantidadeEmEstoque -= quantidade;
    }

    public void incrementaEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public Double getPrecoUnitario() {
        return this.precoUnitario;
    }

}
