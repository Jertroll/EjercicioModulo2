package EjercicioCiudad;

public class EjercicioCiudad {
    public static void main(String[] args){
        Ciudad liberia = new Ciudad();

        liberia.setNombre("Liberia");
        liberia.setPais("Costa Rica");
        liberia.setPoblacion(1000);
        liberia.setPresidente("Manolo");


        System.out.println(liberia.getNombre());
        System.out.println(liberia.getPais());
        System.out.println(liberia.getPoblacion());
        System.out.println(liberia.getPresidente());
    }

}


