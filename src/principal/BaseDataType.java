package principal;

public class BaseDataType {
	public static void main (String[] args) {
		byte a1 = 1; //1byte = 8bits
		short a2 = 10; //2bytes = 16bits
		int a3 = 100; //4bytes = 32 bits
		long a4 = 1000; //8bytes = 64 bits
		double a5 = 10.1;//8byte = 64 bits
		float a6 = 12.2f;
		char c1 = 'a';
		boolean d1 = true;
		boolean d2 = false;

		System.out.println("\nByte = "+a1+" //1byte = 8bits\nShort = "+a2+" //2bytes = 16bits\nInt = "+a3+" //4bytes = 32 bits\nLong = "+a4+" //8bytes = 64 bits\n");
		System.out.println("Double = "+a5+" 8Bytes = 64 bits");
		System.out.println("Float = "+a6+" 4Bytes = 32 bits");
		System.out.println("Char = "+c1+" 2Bytes = 16 bits");
		System.out.println("Boolean = "+d1+" 1Byte = 8 bits");
		System.out.println("Boolean = "+d2+" 1Byte = 8 bits");
	}
}
