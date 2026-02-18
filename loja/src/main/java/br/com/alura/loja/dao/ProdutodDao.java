package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.EntityManager;

public class ProdutodDao {

    private EntityManager em;

    public ProdutodDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

}
