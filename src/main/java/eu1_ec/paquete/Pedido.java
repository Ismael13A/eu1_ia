package eu1_ec.paquete;

public class Pedido {

    private String codigo;
    private String producto;
    private double valor;
    private String tipoCliente;


    public Pedido(){

    }

    public Pedido(String codigo, String producto, double valor, String tipoCliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valor = valor;
        this.tipoCliente = tipoCliente;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    


}
