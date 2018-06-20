/**
 * @matheuspsantos
 *
 */
// Classe da pessoa Fisica

package models;

public class Cliente extends Usuario {

    private String cpf;

    // metodos
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }
}

