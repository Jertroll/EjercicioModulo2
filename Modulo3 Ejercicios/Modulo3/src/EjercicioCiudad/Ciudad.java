package EjercicioCiudad;

public class Ciudad {
    String nombre;
    int poblacion;
    String pais;
    String presidente;

    public Ciudad(String nombre, int poblacion, String pais, String presidente){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.presidente = presidente;
    }

    public Ciudad() {

    }

    public String getNombre(){
        return nombre;
    };

    public void setNombre(String nombre){
      this.nombre = nombre;
    };

    public int getPoblacion(){
      return poblacion;
    };

    public void setPoblacion(int poblacion){
      this.poblacion = poblacion;
    };

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    };

    public String getPresidente(){
        return presidente;
    };

    public void setPresidente(String presidente){
        this.presidente = presidente;
    };




}
