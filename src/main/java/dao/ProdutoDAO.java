/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Produto;

/**
 *
 * @author Davidson
 */
public class ProdutoDAO {

    private ArrayList<Produto> produtos;
    private static ProdutoDAO instance;

    private ProdutoDAO() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Achocolatado em PÃ³", 6, 11.99));
        produtos.add(new Produto(2, "AÃ§Ãºcar Refinado", 15, 29.9));
        produtos.add(new Produto(3, "Arroz Agulhinha Tipo 1", 8, 24.10));
        produtos.add(new Produto(4, "Biscoito Recheado (Sabores)", 5, 3.78));
        produtos.add(new Produto(5, "Biscoito Cream Cracker", 15, 4.95));
        produtos.add(new Produto(6, "CafÃ© Torrado e MoÃ­do", 7, 19.50));
        produtos.add(new Produto(7, "Creme de Leite", 13, 2.65));
        produtos.add(new Produto(8, "Ervilha em Conserva", 9, 19.30));
        produtos.add(new Produto(9, "Farinha de Trigo", 7, 3.55));
        produtos.add(new Produto(10, "Farinha de Mandioca Temperada", 6, 2.70));
        produtos.add(new Produto(11, "FeijÃ£o Carioca Tipo 1", 6, 6.65));
        produtos.add(new Produto(12, "FubÃ¡ Mimoso", 14, 3.71));
        produtos.add(new Produto(13, "Leite em PÃ³ Integral", 5, 25.79));
        produtos.add(new Produto(14, "MacarrÃ£o Espaguete", 13, 3.15));
        produtos.add(new Produto(15, "MacarrÃ£o Parafuso", 10, 5.95));
        produtos.add(new Produto(16, "Mistura para Bolo (Sabores)", 12, 41.10));
        produtos.add(new Produto(17, "Ã“leo de Soja", 13, 7.89));
        produtos.add(new Produto(18, "PÃ³ para Gelatina (Sabores)", 5, 1.45));
        produtos.add(new Produto(19, "Polpa de Tomate", 5, 33.95));
        produtos.add(new Produto(20, "Sal Refinado", 7, 1.29));
        produtos.add(new Produto(21, "Sardinha", 12, 18.80));
        produtos.add(new Produto(22, "Tempero Completo/ Alho e Sal", 15, 2.57));
        produtos.add(new Produto(23, "Amaciante LÃ­quido (FragrÃ¢ncias)", 5, 10.48));
        produtos.add(new Produto(24, "Creme Dental", 9, 1.30));
        produtos.add(new Produto(25, "Desinfetante (FragrÃ¢ncias)", 10, 27.99));
        produtos.add(new Produto(26, "Papel HigiÃªnico", 14, 11.19));
        produtos.add(new Produto(27, "Sabonete (FragrÃ¢ncias)", 11, 1.89));
        produtos.add(new Produto(28, "1 KG de Carne Bovina", 11, 31.89));
        produtos.add(new Produto(29, "1 KG de Carne SuÃ­na", 11, 21.39));
        produtos.add(new Produto(30, "1 KG de Carne de Frango", 11, 14.39));
        produtos.add(new Produto(31, "1 dÃºzia de ovos", 16, 7.19));
        produtos.add(new Produto(32, "Leite Integral UHT 1 Litro", 100, 3.69));
        produtos.add(new Produto(33, "Manteiga com Sal 100G", 32, 4.98));
        produtos.add(new Produto(34, "1 Kg PÃ£o FrancÃªs", 20, 7.00));
        produtos.add(new Produto(35, "1 Kg batata", 200, 1.71));
        produtos.add(new Produto(36, "1 Kg tomate", 120, 6.00));
        produtos.add(new Produto(37, "1 dÃºzia de banana", 20, 2.50));
    }

    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        return instance;
    }

    private void verificaQuantidade(double quantidade) {
        if (quantidade <= 0) {
            throw new RuntimeException("Quantidade deve ser > 0");
        }
    }

    public void adicionaEstoque(int codigo, int quantidade) {
        verificaQuantidade(quantidade);
        Produto produto = buscaProdutoPorCodigo(codigo);
        produto.incrementaEstoque(quantidade);
    }

    private double getQuantidadeEmEstoque(int codigo) {
        return buscaProdutoPorCodigo(codigo).getQuantidadeEmEstoque();
    }

    public void baixaEstoque(int codigo, int quantidade) {
        verificaQuantidade(quantidade);
        Produto produto = buscaProdutoPorCodigo(codigo);
        double quantidadeEmEstoque = getQuantidadeEmEstoque(codigo);
        if (quantidadeEmEstoque >= quantidade) {
            produto.decrementaEstoque(quantidade);
        } else {
            throw new RuntimeException("Quantiade (" + quantidade + ") do produto " + codigo + "insuficiente em estoque (" + quantidadeEmEstoque + ")");
        }

    }

    public Produto buscaProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        throw new RuntimeException("Produto " + nome + " nÃ£o encontrado!");
    }

    public Produto buscaProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        throw new RuntimeException("Produto com o cÃ³digo " + codigo + " nÃ£o encontrado!");
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public int getNroProdutos() {
        return produtos.size();
    }

}