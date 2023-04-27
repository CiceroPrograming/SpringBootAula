package com.br.aulaweb01.aulaweb01.Model;

public class Aluno {

    private int id;
    private String nome;
    private String usuario;

    public Aluno(int id, String nome, String usuario) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
    }

    public Aluno() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
