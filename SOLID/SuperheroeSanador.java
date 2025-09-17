package SOLID;

public class SuperheroeSanador implements Curar{
    @Override
    public void usarPoder(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " usa su poder de curacion");
    }
    
    @Override
    public void curar(Superheroe heroe) {
        System.out.println(heroe.getNombre() + " esta curando heridas");
    }
}
