package Conversor;

import static Conversor.Conversor.Reversa;
import static Conversor.DecGeral.*;

public class BinGeral {
    public static String binOct(String bin){
        String dec = binDec(bin);
        return decOct(dec);
    }
    public static String binDec(String bin){
        String[] binReverso = Reversa(bin).split("");
        int dec = 0;
        for (int k=0; k<bin.length(); k++) {dec+=Integer.parseInt(binReverso[k])*Math.pow(2,k);}
        return ""+dec;
    }
    public static String binHexa(String bin){
        String dec = binDec(bin);
        return decHexa(dec);
    }
}