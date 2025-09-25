package SOLID;

// Single Responsability: Aquí se aplica
// asignandole una clase superheroe
// generico y si tiene poder se delega
// a las interfaces y se llaman en
// otra clase.

// Liskov Principle: Aquí las clases
// que implementan las interfaces
// pueden sustituir a la interfaz
// padre sin afectar el comportamiento.
public class Superheroe {
    String nombre;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

// Open/Close: Se aplica creando una
// nueva interfaz en lugar de
// modificar la clase o interfaz
// ya existente.

// Interface Segregation: Muchas
// interfaces específicas que una
// general.
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

