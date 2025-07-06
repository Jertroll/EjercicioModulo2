package CondicionalesComplejas;

public class cantidadCifras {
    public static void main(String[] args){
        int num = 2;
        String numStr = String.valueOf(num);

        if(numStr.length() > 4){
            System.out.println("Tu numero es mayor a 4 cifras");
        } else if(numStr.length() == 3){
            System.out.println("Tu numero " + num + " tiene 3 cifras");
        } else if(numStr.length() == 4){
            System.out.println("Tu numero " + num + " tiene 4 cifras");
        } else if (numStr.length() == 2) {
            System.out.println("Tu numero " + num + " tiene 2 cifras");
        } else if (numStr.length() == 1) {
            System.out.println("Tu numero " + num + " tiene 1 cifra");
        } else{
            System.out.println("Error, numero no valido");
        }

    }
}
