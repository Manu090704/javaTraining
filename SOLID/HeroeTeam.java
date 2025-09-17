package SOLID;

public class HeroeTeam {
    private Power power;

    public HeroeTeam(Power power) {
        this.power = power;
    }

    public void accionHeroe(Superheroe heroe) {
        power.usarPoder(heroe);
    }
}
