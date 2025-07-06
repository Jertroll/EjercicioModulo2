package EjericiosFor;

public class EjercicioDiscord {
    public static void main(String[] args){
        /*
        * Desarrollar un ejercicio que, dado un vector de cinco nombres, cambie todas
            las letras de los nombres por números, de manera que el nombre termine
            estando compuesto por solo números, por ejemplo:
            “DIEGO” – “129851”
            “JUAN” – “6731”
        * */

        String[] name = {"JEREMY", "CARLOS", "KEVIN", "LUIS", "NOE"};
        char[] letras = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'
        };
        int[] posiciones = {
                1, 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21,
                22, 23, 24, 25, 26
        };
        String auxName = "";
        for(int i = 0; i < name.length; i++){

            for(int j = 0; j < name[i].length(); j++){
                for(int x = 0; x < letras.length; x++){
                    if(name[i].charAt(j) == letras[x]){
                        int pos = posiciones[x];
                        auxName = auxName + pos;

                    }

                }

            }
            name[i] = auxName;
            System.out.println(name[i]);
            auxName = "";
        }

    }
}
