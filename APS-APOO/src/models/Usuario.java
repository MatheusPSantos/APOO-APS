/**
 * @matheuspsantos
 */
// Classe mãe Usuário
package models;

import view.ViewCadastro;

public class Usuario {
    // atributos da classe
    private String nome;
    private String email;
    private String senha;
    private String[] endereco = new String[3];
    private String telefone;

    private ViewCadastro viewCadastro = new ViewCadastro();
    // métodos acessores

    // set's
    public void setNome(ViewCadastro viewCadasrtro) {
        this.nome = viewCadastro.Nome;
    }

    public void setEmail(ViewCadastro viewCadastro) {
        this.email = viewCadastro.Email;
    }

    public void setSenha(ViewCadastro viewCadastro) {
        this.senha = viewCadastro.Senha;
    }

    public void setEndereco(ViewCadastro viewCadastro) {
        this.endereco[0] = viewCadastro.Rua;
        this.endereco[1] = viewCadastro.Numero;
        this.endereco[2] = viewCadastro.Bairro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // get's
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }


    public String getTelefone() {
        return this.telefone;
    }

    // método de cadastramento
    private void fazerCadastro() {

    }
}

