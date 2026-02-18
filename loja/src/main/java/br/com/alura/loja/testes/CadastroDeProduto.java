package br.com.alura.loja.testes;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutodDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi",
                "Muito Legal",new BigDecimal("800"), celulares  );

        EntityManager em = JPAUtil.getEntityManager();
        ProdutodDao produtoDao = new ProdutodDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }

}
