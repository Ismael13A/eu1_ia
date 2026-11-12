package eu1_ec.paquete;

import eu1_ec.paquete.extensiones.DescuentoNormal;
import eu1_ec.paquete.extensiones.DescuentoVIP;
import eu1_ec.paquete.extensiones.DescuentoViejitos;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    public static void Main(String[] args){
        Quarkus.run(Main.class, args);
    }

    @Inject 
    PedidoService pedidoService;
    @Inject 
    DescuentoVIP descuentoVIP;
    @Inject 
    DescuentoNormal descuentoNormal;
    @Inject 
    DescuentoViejitos descuentoViejitos;

    @Override
    public int run(String... args) throws Exception {
       
        System.out.println("INCIO_EVALUACION");
        Pedido pedido1 = new Pedido("P001","Laptop",1000.00,"VIP");
        pedidoService.realizar(pedido1,descuentoVIP);
        Pedido pedido2 = new Pedido("P002","Mouse",100.00,"NORMAL");
        pedidoService.realizar(pedido2,descuentoNormal);
        Pedido pedido3 = new Pedido("P003","Teclado",200.00,"VIP");
        pedidoService.realizar(pedido3,descuentoVIP);
        Pedido pedido4 = new Pedido("P004","Cafetera",100.00,"TERCERA_EDAD");
        pedidoService.realizar(pedido4,descuentoViejitos);
        System.out.println("172219-ia");

        return 0;
    }

}
