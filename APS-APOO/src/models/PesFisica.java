/**
 * @matheuspsantos
 *
 */
// Classe para pessoa física

package models;

public class PesFisica extends Usuario {
    // atributos
    String cpf;

    // métodos acessores
    // set's
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    //get's
    public String getCPF() {
        return this.cpf;
    }

    // métodos específicos
    
    /**
     * o método realizarPedido() retorna um valor booleano para indicar o sucesso da ação
     * não recebe parâmetro por enquanto
     */
    public boolean realizarPedido() {
        boolean flag = false; // variavel de verificação do estado do pedido
        return flag; // retornar o estado do pedido, se for 1 = PEDIDO REALIZADO se 0 = ERRO NO PEDIDO
    }

    /**
     * o método cancelarPedido() não retorna nenhum valor
     * não recebe parâmetro por enquanto
     */
    public void cancelarPedido() {

    }

    /**
     * o método realizarPagamento() retorna um valor booelano indicando o sucesso da ação
     * não recebe nenhum parâmetro por enquanto
     * 1 = pagamento realizado com sucesso
     * 0 = falha no pagamento
     */
    public boolean realizarPagamento() {
        boolean flag = false; // flag que indica o sucesso do pagamento

        return flag;
    }
}

