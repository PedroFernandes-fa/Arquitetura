package Conversor;

import java.util.Scanner;
import static Conversor.BinGeral.*;
import static Conversor.OctGeral.*;
import static Conversor.DecGeral.*;
import static Conversor.HexaGeral.*;

public class Conversor {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Insira a Quantidade de Operações:");
        int   Vezes = Integer.parseInt(Ler.nextLine());
        for (int k=0; k<Vezes; k++) {
            System.out.println("Insira a Base:");
            int Tipo = Integer.parseInt(Ler.nextLine());
            if(Tipo!=2&&Tipo!=8&&Tipo!=10&&Tipo!=16) {System.out.println("Tipo Invalido!");System.exit(0);}
            System.out.println("Insira o Número:");
            String Num = Ler.nextLine();
            if (Tipo == 2) {
                System.out.println("Em Octal: "   + binOct(Num));
                System.out.println("Em Decimal: " + binDec(Num));
                System.out.println("Em Hexa: "    + binHexa(Num));
            } else if (Tipo == 8) {
                System.out.println("Em Binario: " + octBin(Num));
                System.out.println("Em Decimal: " + octDec(Num));
                System.out.println("Em Hexa: "    + octHexa(Num));
            } else if (Tipo == 10) {
                System.out.println("Em Binario: " + decBin(Num));
                System.out.println("Em Octal: "   + decOct(Num));
                System.out.println("Em Hexa: "    + decHexa(Num));
            } else {
                System.out.println("Em Binario: " + hexaBin(Num));
                System.out.println("Em Octal: "   + hexaOct(Num));
                System.out.println("Em Decimal: " + hexaDec(Num));
            }
        }
        Ler.close();
    }
    public static String Reversa(String S) {return new StringBuilder(S).reverse().toString();}
}