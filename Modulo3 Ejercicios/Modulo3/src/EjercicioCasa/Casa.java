package EjercicioCasa;
/*
ciudad, barrio, color,
pisos, habitaciones, baños y cocinas, se deben inicializar todos los
atributos dentro de la clase, de forma que serán atributos
CONSTANTES y sólo se crearán los Getters.
*/
public class Casa {
    private  String ciudad;
    private  String barrio;
    private  String color;
    private  int pisos;
    private  int habitaciones;
    private  int banos;
    private  int cocinas;


    public Casa(){
        this.ciudad = "Liberia";
        this.barrio = "Moracia";
        this.color = "Blanco";
        this.pisos = 2;
        this.habitaciones = 2;
        this.banos = 2;
        this.cocinas = 1;
    };
    //Constructor 1 ejercicio 3
    public Casa(String ciudad, String barrio, String color){
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    };
    //Constructor 2 ejercicio 3
    public Casa(String barrio, String color, int pisos){
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    };

    //Constructor 3 ejercicio 3
    public Casa(int pisos, int habitaciones, int banos, int cocinas){
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
    };




    public String getCiudad(){
        return ciudad;
    };

    public String getBarrio(){
        return barrio;
    };

    public String getColor(){
        return color;
    };

    public int getPisos(){
        return pisos;
    };

    public int getHabitaciones(){
        return habitaciones;
    };

    public int getBanos(){
      return banos;
    };

    public int getCocinas(){
        return cocinas;
    };

}
