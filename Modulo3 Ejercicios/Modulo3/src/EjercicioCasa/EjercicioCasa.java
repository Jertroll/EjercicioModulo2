package EjercicioCasa;



public class EjercicioCasa {
    public static void main(String[] args){

        Casa casa1 = new Casa("Bagaces", "bagayork", "negro");

        System.out.println("La ciudad es: " + casa1.getCiudad());
        System.out.println("El barrio de la casa es: " + casa1.getBarrio());
        System.out.println("\nEl color de la casa es: " + casa1.getColor());


        Casa casa2 = new Casa("bagayork", "azul", 1);


        System.out.println("El barrio de la casa es: " + casa2.getBarrio());
        System.out.println("El color de la casa es: " + casa2.getColor());
        System.out.println("\nLa casa tiene " + casa2.getPisos() + " pisos");


        Casa casa3 = new Casa(2, 3, 2, 1);

        System.out.println("La casa tiene " + casa3.getPisos() + " pisos");
        System.out.println("La casa tiene "+casa3.getHabitaciones() + " habitaciones");
        System.out.println("Baños: " + casa3.getBanos());
        System.out.println("Cocinas: " + casa3.getCocinas());
    }
}
