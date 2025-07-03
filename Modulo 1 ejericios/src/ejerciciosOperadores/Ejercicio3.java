package ejerciciosOperadores;

public class Ejercicio3 {
    public static void main(String[] args){
        int num1 = 8;
        int num2 = 2;
        int aux = 0;

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println(num1);
        System.out.println(num2);

    }
}
