import java.util.ArrayList;

public class EjercicioSeis {
    //66. Dada una matriz de String de 4 x 4 conformada por palabras, hallar las palabras que tienen dos vocales seguidas de forma recursiva y agregarlas a un ArrayList. Ejemplo de la matriz a probaren el archivo adjunto.
    //
    //
    //Para recorrer la matriz se debe hacer de forma recursiva. Función a utilizar  recorrerMatriz(matriz,i,j, listaPalabras)
    //
    //Para verificar si la palabra tiene 2 vocales seguidas se debe hacer de forma recursiva. Funciona a utilizar verificarVocalesSeguidas(identificar los parámetros que necesita)
    public static void main(String[] args) {
        String[][] m = {{"vacio", "carro", "baul", "perro"}, {"colombia", "casa", "moto", "caza"}, {"llanta", "reir", "archivo", "silla"}, {"cocina", "ola", "ave", "freir"}};
        ArrayList<String> listaPalabras = new ArrayList<>();
        recorrerMatriz(m, 0, 0, listaPalabras);
        System.out.println(listaPalabras);
    }

     public static ArrayList<String> recorrerMatriz(String[][] m, int i, int j, ArrayList<String> listaPalabras) {
         if (i == m.length || j == m[i].length) {
             return listaPalabras;
         } else {
             if (verificarVocalesSeguidas(m[i][j],0) == true) {
                 listaPalabras.add(m[i][j]);
             }
             if (j == m[i].length - 1) {
                 i++;
                 j = 0;
             } else {
                 j++;
             }
             return recorrerMatriz(m, i, j, listaPalabras);
         }

     }

    private static boolean verificarVocalesSeguidas(String palabra, int indice) {
        if (indice == palabra.length() - 1) {
            return false;
        } else {
            if (esVocal(palabra.charAt(indice)) && esVocal(palabra.charAt(indice + 1))) {
                return true;
            } else {
                return verificarVocalesSeguidas(palabra, indice + 1);
            }
        }
    }

    private static boolean esVocal(char letra) {
        return (letra== 'a' || letra== 'e' || letra== 'i'|| letra=='o' || letra == 'u');
    }
}