package com.bandtec.exercicios.relacionamento;

import java.util.List;
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
        return null;
    }

    /*
        Deve adicionar um produto, não deve permitir duplicidade (nome),
        se for o caso, não faça nada;
     */
    public void adicionar(Produto produto) {

    }

    /*
        Deve verificar se existe um objeto com o nome informado, caso nao tenha
        deve retornar false;
     */
    public Boolean existsPorNome(String nome) {
        return null;
    }

    /*
        Deve retornar a quantidade existente a partir da categoria informada;
     */
    public Integer getQuantidadePorCategoria(String categoria) {
        return null;
    }

    /*
        Deve limpar a lista(remover todos os elementos);
     */
    public void limpar() {

    }

    /*
        Deve remover um produto, caso nao exista, não faça nada.
     */
    public void removerPorNome(String nome) {

    }

    /*
        Deve recuperar um produto, caso nao exista, retorne null.
     */
    public Produto getPorNome(String nome) {
        return null;
    }

    /*
        Deve retornar o valor total do produtos contidos no carrinho, caso lista
        esteja vazia, retorne 0;
     */
    public Double getValorTotal() {
        return null;
    }
}
