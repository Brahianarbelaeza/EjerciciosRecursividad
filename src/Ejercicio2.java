public class Ejercicio2 {

    //2 .Invertir una palabra de forma recursiva. Invertir cuando se deuelva la recursión


    public static void main(String[] args) {

        String palabra = invertirPalabra("alejo",0);
        System.out.println(palabra);

    }
    public static String invertirPalabra(String palabra,int indice){
        if(indice > palabra.length()-1){
            //   System.out.println(palabra.charAt(indice));
            return "";//String.valueOf(palabra.charAt(indice));

        }else{

            return invertirPalabra(palabra, indice+1) + palabra.charAt(indice);


        }
    }

}
