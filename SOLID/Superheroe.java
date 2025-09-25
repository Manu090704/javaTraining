package SOLID;

//Single Responsability: Aquí se aplica
// asignandole una tarea a una clase
// superheroe generico y si vuela
// se agrega en otra clase.

// Liskov Principle: Aquí se aplica
// en el main ya que vemos como se
// declaran los objetos con su clase
// base o padre.
public class Superheroe {
    String nombre;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

// Open/Close: Aquí se aplica
// creando una nueva interfaz
// en lugar de modificar la clase
// o interfaz ya existente.

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

