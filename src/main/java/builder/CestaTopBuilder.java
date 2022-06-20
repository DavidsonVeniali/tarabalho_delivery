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
public class CestaTopBuilder implements Builder {

    private ProdutoDAO produtoDAO;
    private ArrayList<ItemPedido> itens;

    public CestaTopBuilder() {
        this.produtoDAO = ProdutoDAO.getInstance();
        itens = new ArrayList<>();
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public void insereItens() {
        //biscoito
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(4)));
        //cane
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(28)));
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(29)));
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(30)));
        //farinha de trigo
        itens.add(new ItemPedido(6, produtoDAO.buscaProdutoPorCodigo(9)));
        //feijao
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(11)));
        //cafe
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(6)));
        //oleo
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(17)));
        //manteiga
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(33)));
        //leite
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(32)));
        //arroz
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(3)));
        //sabonete
        itens.add(new ItemPedido(6, produtoDAO.buscaProdutoPorCodigo(27)));
        //sal
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(20)));
        //pao
        itens.add(new ItemPedido(9, produtoDAO.buscaProdutoPorCodigo(34)));
        //farinha
        itens.add(new ItemPedido(7, produtoDAO.buscaProdutoPorCodigo(10)));
        //batata
        itens.add(new ItemPedido(9, produtoDAO.buscaProdutoPorCodigo(35)));
        //tomate
        itens.add(new ItemPedido(9, produtoDAO.buscaProdutoPorCodigo(36)));
        //banana
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(37)));
        //achocolatado
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(1)));
        //acucar
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(2)));
        //creamcracker
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(4)));
        //ovo
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(31)));
        //macarrao
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(14)));
        //fuba
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(12)));
        //tempero
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(22)));
        //desinfetante
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(25)));
        //papel higienico
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(26)));
        //creme dental
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(24)));

    }
}
