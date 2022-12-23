package principal;

public class TypeConvert {
    public static void main (String[] args) {
        byte varByte = 1;
        int varInt = 2;
        varInt = varByte;
        byte varByte2 = 1;
        int varInt2 = 2;
        varByte2 = (byte)varInt2 ;
        char f1 = 'a';
        int f2 = 98;
        f1 = (char)f2;
        System.out.println("\n"+varInt+"\n"+varByte2+"\n"+f1);

    }
}
