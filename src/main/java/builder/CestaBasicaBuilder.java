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
public class CestaBasicaBuilder implements Builder {

    private ProdutoDAO produtoDAO;
    private ArrayList<ItemPedido> itens;

    public CestaBasicaBuilder() {
        this.produtoDAO = ProdutoDAO.getInstance();
        itens = new ArrayList<>();
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
    
    @Override
    public void insereItens() {
        //carne
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(28)));
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(29)));
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(30)));
        //cafe
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(6)));
        //feijao
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(11)));
        //farinha de trigo
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(9)));
         //leite
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(32)));
        //legumes
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(35)));
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(36)));



    }
}
