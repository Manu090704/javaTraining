package Anotaciones;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Se especifica si es para metodos, atributos o clases
// si da error en tiempo de compilacion o de ejecución
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

// @interface nombre de tu anotacion y valores que recibe
public @interface Anotaciones {
    String author() default "Desconocido";
    String date();
    int version() default 1;
}
