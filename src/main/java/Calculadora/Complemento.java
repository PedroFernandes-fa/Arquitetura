package Calculadora;
import static Calculadora.Adicao.Soma;
import static Calculadora.Codificacao.CodificadorCompleto;
import static Calculadora.Codificacao.CodificadorReverso;

public class Complemento {
    public static String CO1(String Code, int Tam) {
        String[] CodeExtenso = Code.split("");
        boolean[] Bit = CodificadorCompleto(CodeExtenso, Tam);
        boolean[] Co1 = new boolean[Tam];
        for (int k=0; k<Tam; k++) {Co1[k] = !Bit[k];}
        return CodificadorReverso(Co1);
    }
    public static String CO2(String Co1, int Tam) {
        return Soma(Co1, "1", Tam);
    }
    public static String Complementador(String Code, int Tam){
        return CO2(CO1(Code, Tam), Tam);
    }
}
