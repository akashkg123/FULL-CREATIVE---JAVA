package Trainning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassClass {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter your name: ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String ab = br.readLine();
			System.out.println("I am " + ab);

		}

		try {
			int a = 10;
			int b = 20;
			if (a / b != 200) {

				throw new MyException("Akash CHECK");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}
