package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class JogadorRepositorio {

    private final SessionFactory sessionFactory;

    public JogadorRepositorio(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Jogador buscarPorId(Long id) throws JogadorNaoEncontradoException {
        try (Session session = sessionFactory.openSession()) {
          Jogador player = session.get(Jogador.class, id);
            if (player == null) {
                throw new JogadorNaoEncontradoException("Jogador com ID " + id + " não foi encontrado.");
            }
            return player;
        }
    }
}