package Hilos;

public class hilos implements Runnable{
    @Override
    public void run() {
        System.out.println("Concurrencia: ");
        System.out.println("Hola desde un hilo por interfaz");
    }
}

public class extends Threads {
    @Override
    public void run(){
    System.out.println("Hola desde un hilo por clase");
    }
}
