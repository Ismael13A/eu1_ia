package eu1_ec.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements Descuentos {

    @Override
    public double descuento(double valor) {
        double descuentoAplicado = valor - valor * 0.10;
        return descuentoAplicado;
        
    }

}
