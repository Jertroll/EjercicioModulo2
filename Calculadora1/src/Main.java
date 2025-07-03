import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void CalcularPar(int num1){
    if(num1 % 2 == 0){
        System.out.println("El numero ingresado es par");
    } else {
        System.out.println("El numero es impar");
    }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite un numero para saber si es par o impar");
        while(sc.hasNextInt()){
            num = sc.nextInt();
            CalcularPar(num);
            System.out.println("Digite otro número para saber si es par o impar (o cualquier letra para salir):");
        }
        System.out.println("Entrada inválida. Programa finalizado.");
        sc.close();

    }
}