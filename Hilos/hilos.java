package Hilos;

public class hilos implements Runnable{
    @Override
    public void run() {
        System.out.println("Concurrencia: ");
        System.out.println("Hola desde un hilo");
    }
}
