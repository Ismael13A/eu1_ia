package eu1_ec.paquete.interceptor;

import eu1_ec.paquete.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Duracion 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION +(100))
public class DuracionInter {

    @AroundInvoke 
    public Object revisar(InvocationContext context) throws Exception{

        double inicio = System.currentTimeMillis(); 
        Object result = context.proceed();
        double fin = System.currentTimeMillis();
        double duracion = fin - inicio;
        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores [0];
        String codigo = pedido.getCodigo();
        System.out.println("NOTIFICACION:"+codigo);
        System.out.println("DURACION:"+ codigo +"|MS:"+ duracion );
        System.out.println("TIEMPO:" +codigo+"|OK");
        return result; 
    }

}
