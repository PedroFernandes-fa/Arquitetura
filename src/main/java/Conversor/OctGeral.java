package Conversor;

import static Conversor.Conversor.Reversa;
import static Conversor.DecGeral.*;

public class OctGeral {
    public static String octBin(String oct){
        String dec = octDec(oct);
        return decBin(dec);
    }
    public static String octDec(String oct){
        String[] octReverso = Reversa(oct).split("");
        int dec = 0;
        for (int k=0; k<oct.length(); k++) {dec+=Integer.parseInt(octReverso[k])*Math.pow(8,k);}
        return ""+dec;
    }
    public static String octHexa(String oct){
        String dec = octDec(oct);
        return decHexa(dec);
    }
}