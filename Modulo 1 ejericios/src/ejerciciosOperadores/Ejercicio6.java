package ejerciciosOperadores;

public class Ejercicio6 {
    public static void main(String[] args){
        int ladoCuadrado = 8;
        System.out.println("El area del cuadrado es: " + ladoCuadrado* ladoCuadrado);
        System.out.println("EL perimetro del cuadrado es: " + ladoCuadrado*4);

        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;

        System.out.println("El perimetro del triangulo es: " + ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo);
        System.out.println("El area del triangulo es: " + (baseTriangulo * alturaTriangulo) / 2);

        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        System.out.println("El area del rectangulo es de: " + baseRectangulo * alturaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + 2*(baseRectangulo + alturaRectangulo));
    }



}
