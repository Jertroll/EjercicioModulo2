public class Ejercicio2 {
    public static void main(String[] args){
        int arrayEjercicio[] = {2, 8, 9, 27, 28, 55, 121};

        for(int i = 0; i < arrayEjercicio.length; i++ ){
            double resultado = Math.sqrt(arrayEjercicio[i]);
            System.out.println("La raiz cuadrada de: " + arrayEjercicio[i] + " Es: -> " + resultado);
        }
    }
}
