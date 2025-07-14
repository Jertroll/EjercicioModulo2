package EjercicioSeguridad;

public class Password {
    private int longitud;
    private String password;

    public Password(){
        this.longitud = 10;
        this.password = "";
    }

    public Password(int longitud){
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public void generar(){
        for(int i = 0; i < this.longitud; i++){
            int num = (int) ((Math.random() * 3) + 1);
            if (num == 1){
                int min = 97;
                int max = 122;

                int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;

                char caracter = (char) numeroAleatorio;
                this.password = this.password + caracter;

            } else if (num == 2) {
                int min = 65;
                int max = 90;

                int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;

                char caracter = (char) numeroAleatorio;

                this.password = this.password + caracter;
            } else {
                int min = 48;
                int max = 57;

                int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;

                char caracter = (char) numeroAleatorio;

                this.password = this.password + caracter;
            }
        }
        System.out.println(this.password);
    }

    public String validar(){
        int min = 0;
        int may = 0;
        int num = 0;

        for(int i = 0; i < this.password.length(); i++){
            char letra = this.password.charAt(i);

            if(Character.isLowerCase(letra)){
                min++;
            } else if (Character.isUpperCase(letra)){
                may++;
            } else {
                num++;
            }

        }

        if(min >= 1 && may >= 2 && num >= 5){
            System.out.println(min + " minisculas");
            System.out.println(may + " mayusculas");
            System.out.println(num + " numeros");
            return "Su password " + this.password + " es SEGURA";
        } else {
            System.out.println(min + " minisculas");
            System.out.println(may + " mayusculas");
            System.out.println(num + " numeros");
            return "Su password " + this.password + " es INSEGURA";

        }
    }

}
