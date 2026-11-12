package eu1_ec.paquete;

import eu1_ec.paquete.extensiones.Descuentos;
import eu1_ec.paquete.interceptor.Duracion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PedidoService {


    @Duracion 
    public void realizar ( Pedido pedido, Descuentos descuentos){

        double descuento = descuentos.descuento(pedido.getValor());
        System.out.println("PEDIDO: "+ pedido.getCodigo()+ "|TOTAL:"+ descuento);
       

    }

}
