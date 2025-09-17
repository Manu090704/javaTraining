package SOLID;

public class Superheroe {
    String nombre;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

interface Power {
    void usarPoder(Superheroe heroe);
}

interface Volar extends Power {
    void volar(Superheroe heroe);
}

interface Correr extends Power {
    void correr(Superheroe heroe);
}

interface Curar extends Power {
    void curar(Superheroe heroe);
}

