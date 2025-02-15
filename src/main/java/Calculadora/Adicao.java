package Calculadora;
import static Calculadora.Codificacao.CodificadorCompleto;
import static Calculadora.Codificacao.CodificadorReverso;

public class Adicao {
    public static boolean[] MeioSomador(boolean A, boolean B) {
        boolean[] Saida = new boolean[2];
        Saida[0] = PortasLogicas.XOR(A, B); //S
        Saida[1] = PortasLogicas.AND(A, B); //Vout
        return Saida;
    }
    public static boolean[] SomadorCompleto(boolean A, boolean B, boolean Vin) {
        boolean[] Saida = new boolean[2];
        boolean xorAB   = PortasLogicas.XOR(A,B);
        Saida[0]        = PortasLogicas.XOR(xorAB,Vin); //S
        boolean andAB   = PortasLogicas.AND(A,B);
        boolean z       = PortasLogicas.AND(Vin, xorAB);
        Saida[1]        = PortasLogicas.OR(andAB, z); //Vout
        return Saida;
    }
    public static String Soma(String A, String B, int Tam) {
        String[] a = A.split("");
        String[] b = B.split("");
        if (a.length>Tam) {System.out.println("Valor de A maior que o tamanho."); System.exit(0);}
        if (b.length>Tam) {System.out.println("Valor de B maior que o tamanho."); System.exit(0);}
        boolean[] bitA  = CodificadorCompleto(a, Tam);
        boolean[] bitB  = CodificadorCompleto(b, Tam);
        boolean[] Saida = new boolean[2];
        boolean V = false;
        boolean[] Resultado = new boolean[Tam];
        for (int k=Tam-1; k>-1; k--){
            Saida = SomadorCompleto(bitA[k], bitB[k], V);
            Resultado[k] = Saida[0];
            V            = Saida[1];
        }
        return CodificadorReverso(Resultado);
    }
}
