package LibrosPractica;

public class MainLibro {
    public static void main(String[] args){
        Libro libro1 = new Libro("Dios", "Biblia", 300);

        Libro libro2 = new Libro();

        libro2.setAutor("Miguelito");
        libro2.setTitulo("Juegos de hambre");
        libro2.setPaginas(200);


        System.out.println(libro1.mostrarLibro()+"\n");
        System.out.println(libro2.mostrarLibro()+"\n");

        libro1.compararLibros(libro2.getTitulo(), libro2.getPaginas());


    }
}
