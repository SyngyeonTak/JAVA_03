package java_03;

public class Casting {
	public static void main(String[] args) {
		String num1 ="1";
		String num2 ="2";
		int num3 =3;
		
		//Auto
		System.out.println(11/9);
		System.out.println(11/9.0);
		
		//Casting
		System.out.println((double)11/9);
		System.out.println((int)8.43+2.59);
		System.out.println((int)(8.43+2.59));
		System.out.println((int)8.43+(int)2.59);
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		System.out.println("Hello"+num3+9);
	}
}
