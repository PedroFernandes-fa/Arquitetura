package Calculadora;
import java.util.Scanner;
import static Calculadora.Adicao.Soma;
import static Calculadora.Complemento.*;
import static Calculadora.Subtracao.Diferenca;

public class Calculadora {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a Quantidade de Vezes: ");
        int Vezes = Integer.parseInt(ler.nextLine());
        for (int k=0; k<Vezes; k++) {
            System.out.println("Escolha a operação:\n1-Soma\n2-CO2\n3-Subtrair");
            int Opp = Integer.parseInt(ler.nextLine());
            if (Opp != 1 && Opp != 2 && Opp != 3){System.out.println("Operação invalida"); System.exit(0);}
            System.out.println("Insira o Tamanho: ");
            int Tam = Integer.parseInt(ler.nextLine());
            if (Tam < 0) {System.out.println("Tamanho invalido"); System.exit(0);}
            System.out.println("Insira o Valor de A: ");
            String A = ler.nextLine(); //Preguiça de criar um sistema de verificação de número valido.
            if (Opp == 1 || Opp == 3) {
                System.out.println("Insira o Valor de B: ");
                String B = ler.nextLine();
                if (Opp == 1){System.out.println(Soma(A, B, Tam));}
                if (Opp == 3){System.out.println(Diferenca(A, B, Tam));}
            }
            else {System.out.println(Complementador(A, Tam));}
        }
        ler.close();
    }
}
