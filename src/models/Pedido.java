/**
 * @matheuspsantos
 */
// Aqui que guarda as informações e regras de negócio relacionados aos pedidos

package models;

// Definição da classe Pedido
public class Pedido {
    // atributos
    private String idPedido;
    private Float taxaEntrega;
    private Float valorPedido;
    private boolean statusPedido;

    // métodos acessores

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdPedido() {
        return this.idPedido;
    }

    public void setValorPedido(Float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Float getValorPedido() {
        return this.valorPedido;
    }

	public boolean isStatusPedido() {
		return this.statusPedido;
    }
    
	public void setStatusPedido(boolean statusPedido) {
		this.statusPedido = statusPedido;
    }

	public Float getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(Float taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
    }
    
    /**
     * métodos específicos
     */
    public void tipoDeEntrega() {

    }

    /**
     * o método fazer pedido retorna um cod sobre a situação do pedido
     */
    public int fazerPedido() {
        return 0;
    }

    public void cancelarPedido(){
        
    }

}

