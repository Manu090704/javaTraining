import java.util.ArrayList;
import java.util.HashMap;

import Anotaciones.Anotaciones;
import SOLID.*;
import Hilos.hilos;
import ReadRegex.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;


public class Main {
    @Anotaciones(date = "2024-10-10", author = "ManuelBajos", version = 1)
    public static void main(String[] args) {

        System.out.println("Regex:");
        //Expresiones Regulares
        ReadRegex.ReadMatch("hola@ge.com");
        ReadRegex.ReadMatch("@ge.com");
        ReadRegex.ReadMatch("prueba@gmail.com");

        //Hilos
        Thread hilo1 = new Thread(new hilos());
        hilo1.start();


        System.out.println("POO con SOLID:");
        // Superhéroes
        Superheroe superman = new Superheroe("Superman");
        Superheroe flash = new Superheroe("Flash");
        Superheroe healer = new Superheroe("Doctor Strange");

        HeroeTeam team1 = new HeroeTeam(new SuperheroeVolador());
        team1.accionHeroe(superman);

        HeroeTeam team2 = new HeroeTeam(new SuperheroeCorredor());
        team2.accionHeroe(flash);

        HeroeTeam team3 = new HeroeTeam(new SuperheroeSanador());
        team3.accionHeroe(healer);

        //Sistema de tienda online
        Product product = new Product("Laptop", 1000.0);
        PaymentMethod paymentMethod = new CreditCardPayment();
        ImplementDiscount discount = new ImplementDiscount(10); // 10% de descuento

        CheckOut cuenta = new CheckOut(paymentMethod, discount);
        cuenta.processPayment(product); 

        // Variables
        int numero = 10;
        String texto = "Hola";

        System.out.println("Arreglo simple:");
        //array
        int [] arr = {1,2,3,4,5,6,7};
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("Colecciones:");
        // Estructuras más complejas
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        System.out.println(mapa);
        System.out.println(mapa.get("dos"));

        System.out.println("Manejo de excepciones e I/O:");
        // Manejo de excepciones
        try {
            int resultado = numero / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero");
        }

        // Manejo de archivos
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            
            int bytesRead;
            while ((bytesRead = fis.read()) != -1) {
                fos.write(bytesRead);
            }

            System.out.println("Archivo copiado exitosamente.");

        } catch (IOException e) {
            System.out.println("Error con el copiado de archivos: " + e.getMessage());
        }
    }
}
