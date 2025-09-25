package SOLID;

// Dependecy Inmersion Principle:
// Aquí se aplica teniendo esta clase
// que maneja la lógica de los objetos
// creados.
public class HeroeTeam {
    private Power power;

    public HeroeTeam(Power power) {
        this.power = power;
    }

    public void accionHeroe(Superheroe heroe) {
        power.usarPoder(heroe);
    }
}
