package Calculadora;

public class Codificacao {
    public static boolean MeioCodificador(String N) {
        return Integer.parseInt(N) == 1;
    }
    public static boolean[] CodificadorCompleto(String[] num, int tamanho){
        int len = num.length;
        int dif = tamanho-len;
        boolean[] bites = new boolean[tamanho];
        for (int k=0; k<len; k++){
            bites[k+dif] = MeioCodificador(num[k]);
        }
        return bites;
    }
    public static String CodificadorReverso(boolean[] bites){
        StringBuilder num = new StringBuilder();
        for (boolean bite : bites) {
            if (bite) {num.append("1");}
            else {num.append("0");}
        }
        return num.toString();
    }
    public static String deArrayAString(String[] S){
        StringBuilder S2 = new StringBuilder();
        for (String s : S) {
            S2.append(s);
        }
        return S2.toString();
    }
}
