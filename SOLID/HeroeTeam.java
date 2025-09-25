package SOLID;

// Dependency Inversion Principle:
// Se aplica este principio ya
// que la clase depende de la
// abstracción de la interfaz Power
// Esto ayuda a que se invierta
// la dependencia y se puedan crear
// los objetos de diferentes poderes
// sin modificar la clase. Es decir
// ayuda a no tener que llamar a un
// constructor diferente por clase.
public class HeroeTeam {
    private Power power;

    public HeroeTeam(Power power) {
        this.power = power;
    }

    public void accionHeroe(Superheroe heroe) {
        power.usarPoder(heroe);
    }
}
