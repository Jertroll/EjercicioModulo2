package EjericiosFor;

public class Ejercicio4 {
    public static void main(String[] args){
        int num = 3;
        int sumatoria = 0;
        int factorial = 1;
        int numAux = 0;
        for(int i = 0; i <= num; i++){
             sumatoria = sumatoria + i;
        }
        System.out.println("La sumatoria de: " + num + " es " + sumatoria);

        System.out.println("La raiz cuadrada " + Math.cbrt(sumatoria));
        int aleatorio = (int) ((Math.random() * sumatoria) + 1); // número del 1 al 6
        System.out.println("Número aleatorio: " + aleatorio);


        for(int i = 1; i <= sumatoria; i++){
            if (sumatoria % i == 0){
                System.out.println("Los divisores de " + sumatoria + " son: " + i);
            }
        }

        for(int i = sumatoria; i >= 1; i-- ){
            factorial = factorial * i;

        }
        System.out.println("El factorial es: " + factorial);

        for (int i = 1; i < sumatoria; i++){
            if (sumatoria % i == 0){
                numAux = numAux + i;
            }
        }
        if (numAux == sumatoria){
            System.out.println(sumatoria + " Si es un numero perfecto");
        } else {
            System.out.println(sumatoria + " No es un numero perfecto");
        }

    }
}
