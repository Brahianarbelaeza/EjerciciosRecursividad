public class EjercicioTres {
    public static void main(String[] args) {
       // 3. Suma de una matriz de forma recursiva. Retrocediendo en filas y columnas
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int i = m.length-1;
        int j = m[i].length-1;
        int suma = sumaMatrizRecursiva(m, i, j,0);
        System.out.println("La suma de la matriz es: " + suma);

    }
    public static int sumaMatrizRecursiva(int [][] m, int i, int j, int suma){
        suma += m[i][j];
        if (i == 0 && j == 0) {
            return suma;
        }
        if (j == 0) {
            i--;
            j = m[i].length-1;
        } else {
            j--;
        }
        return sumaMatrizRecursiva(m, i, j,suma);

    }

}
