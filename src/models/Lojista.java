/**
 * @matheuspsantos
 */
// Classe para o dono Logista

package models;

public class Lojista extends Usuario {
    // atributos
    private String cnpj;

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    // get's
    public String getCNPJ() {
        return this.cnpj;
    }
    
}

