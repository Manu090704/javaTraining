package SOLID;

public class SuperheroeVolador implements Volar{
    @Override
    public void usarPoder(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " usa su poder de vuelo");
    }
    
    @Override
    public void volar(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " esta volando");
    }
}
