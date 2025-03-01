package br.edu.insper.desagil.aps3.unter;

public class Usuario {
    private String cpf;
    private String nome;

    public Usuario(String cpf, String nome){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void avalia(Corrida corrida, int nota){
    }

}
