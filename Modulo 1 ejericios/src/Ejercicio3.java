public class Ejercicio3 {
    public static void main(String[] args){
        int nota1 = (int) (Math.random() * 10) + 1;
        int nota2 = (int) (Math.random() * 10) + 1;
        int nota3 = (int) (Math.random() * 10) + 1;
        int nota4 = (int) (Math.random() * 10) + 1;
        int nota5 = (int) (Math.random() * 10) + 1;

        double promedio = (double) (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("El promedio de tu nota es de: " + promedio);
    }
}
