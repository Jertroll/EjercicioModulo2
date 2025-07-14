package LibrosPractica;

public class Libro {
    private String autor;
    private String titulo;
    private int paginas;

    public Libro(){

    };

    public Libro(String autor, String titulo, int paginas){
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    };

    public String getAutor(){
        return autor;
    };

    public void setAutor(String autor){
        this.autor = autor;
    };

    public String getTitulo(){
        return titulo;
    };

    public void setTitulo(String titulo){
        this.titulo = titulo;
    };

    public int getPaginas(){
        return paginas;
    };

    public void setPaginas(int paginas){
      this.paginas = paginas;
    };


    //Metodos

    public String mostrarLibro(){

        return "El libro " + titulo + " del autor " + autor +  " tiene " + paginas + " páginas";
    };

    public void compararLibros (String titulo1, int paginas1){
        if (paginas1 > this.paginas){
            System.out.println("El libro " + titulo1 + " tiene mas paginas: num de paginas " + paginas1);
        } else{
            System.out.println("El libro " + this.titulo + " tiene mas paginas: num de paginas " + this.paginas);
        }
    };


}
