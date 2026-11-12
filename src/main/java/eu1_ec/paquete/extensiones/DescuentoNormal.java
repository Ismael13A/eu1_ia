package eu1_ec.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoNormal implements Descuentos {

    @Override
    public double descuento(double valor) {
        double descuentoAplicado = valor *1;
        return descuentoAplicado;
    }

}
