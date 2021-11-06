package com.bandtec.exercicios.relacionamento;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Carrinho {

    //Deve ser informado no momento da criação do objeto
    private String cliente;

    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    /*
        Deve retornar a quantidade total de produtos;
     */
    public Integer getQuantidade() {
        return this.produtos.size();
    }

    /*
        Deve adicionar um produto, não deve permitir duplicidade (nome),
        se for o caso, não faça nada;
     */
    public void adicionar(Produto produto) {
        if (Objects.nonNull(produto) && !existsPorNome(produto.getNome())) {
            this.produtos.add(produto);
        }
    }

    /*
        Deve verificar se existe um objeto com o nome informado, caso nao tenha
        deve retornar false;
     */
    public Boolean existsPorNome(String nome) {
        if (Objects.nonNull(nome)) {
            for (Produto p : this.produtos) { 
                if (p.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /*
        Deve retornar a quantidade existente a partir da categoria informada;
     */
    public Integer getQuantidadePorCategoria(String categoria) {
        if(Objects.nonNull(categoria)) {
            Integer quantidade = 0;
            for (Produto p : this.produtos) {
                if (p.getCategoria().equalsIgnoreCase(categoria)) {
                    quantidade++;
                }
            }
            return quantidade;
        } else {
            return 0;
        }
    }

    /*
        Deve limpar a lista(remover todos os elementos);
     */
    public void limpar() {
        this.produtos.clear();
    }

    /*
        Deve remover um produto, caso nao exista, não faça nada.
     */
    public void removerPorNome(String nome) {
        if (existsPorNome(nome)) {
            this.produtos.remove(getPorNome(nome));
        }
    }

    /*
        Deve recuperar um produto, caso nao exista, retorne null.
     */
    public Produto getPorNome(String nome) {
        if(!existsPorNome(nome)) {
            return null;
        } else {
            for (Produto p : this.produtos) {
                if (p.getNome().equalsIgnoreCase(nome)) {
                    return p;
                }
            }
            return null;
        }
    }

    /*
        Deve retornar o valor total do produtos contidos no carrinho, caso lista
        esteja vazia, retorne 0;
     */
    public Double getValorTotal() {

        if (this.produtos.size() == 0) {
            return 0d;
        } 

        Double total = 0d;
        for(Produto p : this.produtos) {
            total += p.getPreco();
        }

        return total;
    }
}
