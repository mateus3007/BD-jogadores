package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Jogador.class).buildSessionFactory();
        JogadorRepositorio repository = new JogadorRepositorio(sessionFactory);

        // Inserção de jogadores
        insertJogador(sessionFactory, new Jogador("Jogador1", "Tank", "TimeD", "Prata"));
        insertJogador(sessionFactory, new Jogador("Jogador2", "Mid", "TimeE", "Ouro"));
        insertJogador(sessionFactory, new Jogador("Jogador3", "Jungle", "TimeF", "Diamante"));
        insertJogador(sessionFactory, new Jogador("Jogador4", "Support", "TimeG", "Platina"));
        insertJogador(sessionFactory, new Jogador("Jogador5", "ADC", "TimeH", "Ouro"));
        insertJogador(sessionFactory, new Jogador("Jogador6", "Top", "TimeI", "Diamante"));

        // Listagem de jogadores
        listJogadors(sessionFactory);

        // Busca por jogador por ID
        buscarJogadorPorId(repository, 1L); // Substitua pelo ID desejado
        buscarJogadorPorId(repository, 7L); // Exemplo de ID inexistente

        sessionFactory.close();
    }

    private static void insertJogador(SessionFactory sessionFactory, Jogador player) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(transaction);
            transaction.commit();
        }
    }

    private static void listJogadors(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            List<Jogador> players = session.createQuery("from Player", Jogador.class).list();
            for (Jogador player : players) {
                player.printDetails();
            }
        }
    }

    private static void buscarJogadorPorId(JogadorRepositorio repository, Long id) {
        try {
            Jogador player = repository.buscarPorId(id);
            System.out.println("Jogador encontrado: " + player.getName());
        } catch (JogadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
