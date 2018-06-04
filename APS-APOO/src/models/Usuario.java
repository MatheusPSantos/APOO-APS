package models;

/**
 * @matheuspsantos
 */
// Classe mãe Usuário
public class Usuario {
    // atributos da classe
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;

    // métodos acessores

    // set's
    public setNome(String nome) {
        this.nome = nome;
    }

    public setEmail(String email) {
        this.email = email;
    }

    public setSenha(String senha) {
        this.senha = senha;
    }

    public setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // get's
    public getNome() {
        return this.nome;
    }

    public getEmail() {
        return this.email;
    }

    public getSenha() {
        return this.senha;
    }

    public getEndereco() {
        return this.endereco;
    }

    public getTelefone() {
        return this.telefone;
    }
}