package SOLID;

public class SuperheroeCorredor implements Correr{
    @Override
    public void usarPoder(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " usa su poder de super velocidad");
    }
    
    @Override
    public void correr(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " esta corriendo a super velocidad");
    }
}
