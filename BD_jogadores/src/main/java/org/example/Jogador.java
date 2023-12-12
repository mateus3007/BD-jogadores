package org.example;

import javax.persistence.*;


@Entity
@Table(name = "players")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "rank")
    private String rank;

    public Jogador(String name, String role, String teamName, String rank) {
        this.name = name;
        this.role = role;
        this.teamName = teamName;
        this.rank = rank;
    }

    public Jogador() {
    }

    
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Role: " + role + ", Team Name: " + teamName + ", Rank: " + rank);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}