/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.pmgus.infraestrutura.dao;

import java.util.function.Consumer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.jinq.jpa.JPAJinqStream;
import org.jinq.jpa.JinqJPAStreamProvider;

/**
 *
 * @author vinic
 */
public class JinqDao {

    private JinqDao() {
    }

    public static JinqDao getInstance() {
        return new JinqDao();
    }

    public <T> void execute(Class<T> classType, Consumer<JPAJinqStream<T>> action) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("pmgusPU");
        EntityManager em = fabrica.createEntityManager();
        JinqJPAStreamProvider streams = new JinqJPAStreamProvider(fabrica);
        try {
            action.accept(streams.streamAll(em, classType));
        } finally {
            em.close();
            fabrica.close();
        }
    }
}
