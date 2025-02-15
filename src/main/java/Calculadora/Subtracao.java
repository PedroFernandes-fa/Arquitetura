package Calculadora;

import static Calculadora.Adicao.SomadorCompleto;
import static Calculadora.Codificacao.*;
import static Calculadora.Codificacao.CodificadorCompleto;
import static Calculadora.Complemento.Complementador;

public class Subtracao {
    public static String Diferenca(String A, String B, int Tam) {
        String[] a = A.split("");
        String[] b = B.split("");
        if (a.length>Tam) {System.out.println("Valor de A maior que o tamanho."); System.exit(0);}
        if (b.length>Tam) {System.out.println("Valor de B maior que o tamanho."); System.exit(0);}
        boolean[] bitA = new boolean[Tam];
        if (a[0].equals("1")) {
            String[] aa =Complementador(deArrayAString(a), Tam).split("");
            bitA = CodificadorCompleto(aa, Tam);
        } else {bitA = CodificadorCompleto(a, Tam);}
        boolean[] bitB = new boolean[Tam];
        if (a[0].equals("1")) {
            String[] bb =Complementador(deArrayAString(b), Tam).split("");
            bitB = CodificadorCompleto(bb, Tam);
        } else {bitB = CodificadorCompleto(b, Tam);}
        boolean[] Saida = new boolean[2];
        boolean V = false;
        boolean[] Resultado = new boolean[Tam];
        for (int k=Tam-1; k>-1; k--){
            Saida = SomadorCompleto(bitA[k], bitB[k], V);
            Resultado[k] = Saida[0];
            V            = Saida[1];
        }
        return Complementador(CodificadorReverso(Resultado), Tam);
    }
}
