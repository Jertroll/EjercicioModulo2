package EjercicioSeguridad;

public class SeguridadMain {
    public static void main(String[] args){
    Password pass = new Password();

    pass.generar();


    System.out.println(pass.validar());
    }
}
