package Hilos;

//concurrencia: hacer varias tareas al mismo tiempo pero intercalando.
//paralelismo: hacer varias tareas al mismo tiempo pero al mismo tiempo.
public class hilos implements Runnable{
    @Override
    public void run() {
        System.out.println("Concurrencia: ");
        System.out.println("Hola desde un hilo por interfaz");
    }
}

