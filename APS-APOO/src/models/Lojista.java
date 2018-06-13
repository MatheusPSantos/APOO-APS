/**
 * @matheuspsantos
 */
// Classe para o dono Logista

package models;

public class Lojista extends Usuario {
    // atributos
    private String cnpj;

    // métodos acessores
    // set's
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    // get's
    public String getCNPJ() {
        return this.cnpj;
    }

    // métodos específicos
    /**
     * O método consultarEstoque() retorna a quantidade em estoque do produto
     */
    public int consultarEstoque(String idProduto) {
        int qtdEstoque = 0;
        return qtdEstoque;
    }
}

