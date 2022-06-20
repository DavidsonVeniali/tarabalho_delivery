/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import dao.ProdutoDAO;
import java.util.ArrayList;
import model.ItemPedido;

/**
 *
 * @author Davidson
 */
public class CestaPremiumBuilder implements Builder {

    private ProdutoDAO produtoDAO;
    private ArrayList<ItemPedido> itens;

    public CestaPremiumBuilder() {
        this.produtoDAO = ProdutoDAO.getInstance();
        itens = new ArrayList<>();
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public void insereItens() {
        //carnes
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(28)));
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(29)));
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(30)));
        //fuba
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(12)));
        //leite
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(32)));
        //arroz
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(3)));
        //banana
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(37)));
        //feijao
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(11)));
        //farinha de trigo
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(9)));
        //cream crackeer
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(4)));
        //oleo
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(17)));
        //acucar
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(2)));
        //pao
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(34)));
        //batata
        itens.add(new ItemPedido(9, produtoDAO.buscaProdutoPorCodigo(35)));
        //achocolatado
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(1)));
        //manteiga
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(33)));
        //ovo
        itens.add(new ItemPedido(7, produtoDAO.buscaProdutoPorCodigo(31)));
        //sal
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(20)));
        //macarrão
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(14)));
        //cafe
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(6)));
        //tomate
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(36)));

    }
}
