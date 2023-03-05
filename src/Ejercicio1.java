public class Ejercicio1 {

    public static int sumarDiagonalPrincipal(int[][] matriz, int i) {
        if (i ==0) {
            return matriz[0][0];
        } else {
            return matriz[i][i] + sumarDiagonalPrincipal(matriz, i-1);
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {{2,2,3},
                          {4,5,6},
                          {7,8,9}};

        int n = matriz.length-1;
        int suma = sumarDiagonalPrincipal(matriz, n);
        System.out.println("La suma de la diagonal primaria es: " + suma);
    }
    }







