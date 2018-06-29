package Trail;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class A_Stream {
	public void methA() throws IOException {

		System.out.println("Enter number or Letter:");
		int i = System.in.read();
		System.out.println((i));

	}

}

class B_Stream {
	public void methb() throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String a = "Hello";
		byte ab[] = a.getBytes();

		bos.write(ab);
		bos.flush();
		bos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		int j;
		while ((j = bis.read()) != -1) {
			System.out.print((char) j);

		}
		bis.close();
		fis.close();
		System.out.println();

	}
}

class C_Stream {
	private SequenceInputStream cs;

	public void methc() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash.txt" + " ");
		FileInputStream fin1 = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash1.txt" + " ");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash2.txt" + " ");
		FileInputStream fin3 = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash3.txt" + " ");
		FileInputStream fin4 = new FileInputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash4.txt" + " ");

		Vector<FileInputStream> v = new Vector<>();
		v.add(fin);
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		Enumeration<FileInputStream> e = v.elements();
		int i;
		cs = new SequenceInputStream(e);

		while ((i = cs.read()) != -1) {
			System.out.print((char) i);

		}
		System.out.println();

	}

}

class D_Streams {
	public void methd() throws IOException {

		FileOutputStream fis = new FileOutputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash5.txt");
		FileOutputStream fis1 = new FileOutputStream("C:\\Users\\User\\Desktop\\Akash K G\\akash6.txt");

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(100);
		bos.writeTo(fis);
		bos.writeTo(fis1);

		bos.close();
		fis.close();
		fis1.close();
		System.out.println("Success");

	}
}

public class Streams {

	public static void main(String[] args) throws IOException {
		A_Stream ob = new A_Stream();
		System.out.println("HI I am MAIN");
		ob.methA();

		B_Stream ob2 = new B_Stream();
		ob2.methb();

		C_Stream ob3 = new C_Stream();
		ob3.methc();

		D_Streams ob4 = new D_Streams();
		ob4.methd();

		PrintWriter pw = new PrintWriter(System.out);
		pw.write("I am using PrintWriter to print this in the console.");
		pw.flush();
		pw.close();

	}

}
