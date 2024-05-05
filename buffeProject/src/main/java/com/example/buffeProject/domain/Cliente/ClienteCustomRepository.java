package com.example.buffeProject.domain.Cliente;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteCustomRepository {

    private final EntityManager em;

    public ClienteCustomRepository(EntityManager em){
        this.em = em;
    }

    public List<Cliente> filterByName(String name){
        String query = "SELECT c.nome FROM cliente c WHERE c.nome LIKE :name";
        var runQuery = em.createQuery(query, Cliente.class);
        runQuery.setParameter("name", "%" + name + "%");
        var res = runQuery.getResultList();
        return res;
    }
}
