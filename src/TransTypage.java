
public class TransTypage {

	public static void main(String[] args) {
		byte b1 = 15;
		int i1 = 100;
		long l1 = 2000;
		float f1 = 2.5f;
		double d1 = 2.5;
		b1 = (byte) (b1 + 1);
		byte b2 = (byte) i1;
		System.out.println ("b2 : " + b2);
		long l2 = i1;
		System.out.println ("l2 : " + l2);
		int i2 = (int) l1;
		System.out.println ("i2 : " + i2);
		float f2 = l1;
		System.out.println ("f2 : " + f2);
		long l3 = (long) f1;
		System.out.println ("l3 : " + l3);
		double d2 = f1;
		System.out.println ("d2 : " + d2);
		float f3 = (float) d1;
		System.out.println ("f3 : " + f3);
		int i3 = 10;
		long l4 = i3 * (long) 2.5f;
		long l5 = (long) (i3 * 2.5f);
		System.out.println ("\nl4 : " + l4 + "\nl5 : " + l5);
		/* on rappelle que dans une expression arithmétique,
		byte, short sont considérés comme des int*/
		byte b3 = 10;
		short s4 = (short) (2*b3);
		System.out.println ("s4 : " + s4);
		int i4 = 10;
		long l6 = 1000;
		int i5 = (int) (i4 + l6);
		System.out.println ("i5 : " + i5);
		}
	}

