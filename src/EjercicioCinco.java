public class EjercicioCinco {
    //5.Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea mayor.
    public static void main(String[] args) {
        int[][] m = {{1, 2, 321}, {4, 5, 6}, {7, 8, 9}};
        int filamayor= filaMayorSuma(m,0,0,0)+1;
        System.out.println("la fila con la suma mayor es :"+filamayor);
    }


    public static int filaMayorSuma(int[][] m, int i, int j, int mayorsuma, int filamayor) {
        int sumaFila = 0;
        if (j==m[i].length)

        if (sumaFila > mayorsuma) {
                mayorsuma = sumaFila;
                filamayor = i;
        } if (i == m.length - 1) {
            return filamayor;
        }else {
            return filaMayorSuma(m,i+1, mayorsuma, filamayor);
        }
    }
}

