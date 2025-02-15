package Conversor;

public class DecGeral {
    public static String decBin(String dec) {return Integer.toBinaryString(Integer.parseInt(dec));}
    public static String decOct(String dec) {return Integer.toOctalString(Integer.parseInt(dec));}
    public static String decHexa(String dec){return Integer.toHexString(Integer.parseInt(dec));}
}