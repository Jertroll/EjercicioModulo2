public class Ejercicio4 {
    public static void main(String[] args){
        double num1 = Math.round((Math.random() * 50) + 1);
        double num2 = Math.round((Math.random() * 50) + 1);
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);


        System.out.println("El numero mayor es: " + Math.max(num1, num2));

    }
}
