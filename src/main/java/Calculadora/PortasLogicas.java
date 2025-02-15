package Calculadora;

public class PortasLogicas {
    public static boolean AND(boolean A, boolean B) {
        if (A) {return B;}
        return false;
    }
    public static boolean AND(boolean A, boolean B, boolean C) {
        if (A) {if (B) {return C;}}
        return false;
    }
    public static boolean NAND(boolean A, boolean B){
        return !AND(A, B);
    }
    public static boolean NAND(boolean A, boolean B, boolean C) {
        return !AND(A, B, C);
    }
    public static boolean OR(boolean A, boolean B) {
        return A || B;
    }
    public static boolean OR(boolean A, boolean B, boolean C) {
        return A || B || C;
    }
    public static boolean NOR(boolean A, boolean B) {
        return !OR(A, B);
    }
    public static boolean XOR(boolean A, boolean B) {
        return A != B;
    }
    public static boolean NXOR(boolean A, boolean B) {
        return !XOR(A,B);
    }
}