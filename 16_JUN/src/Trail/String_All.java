package Trail;

class String_A {
	public void Basic_String() {

		String s1 = "Akash ";
		String s2 = new String("K G");
		String s3 = "Akash ";
		String s4 = new String("Akash ");

		// String compare
		System.out.println("\t\tSTRING COMPARE");
		System.out.println("String literals with same value (==): " + (s1 == s3));
		System.out.println("New s2 == String literal: " + (s1 == s2) + "\n");

		System.out.println("String literals with same value (.equals): " + (s1.equals(s3)));
		System.out.println("New s4 (.equals) String literal: " + (s1.equals(s4)) + "\n");

		System.out.println("String literals with same value (.compareTo): " + (s1.compareTo(s3)));
		System.out.println("New s2 (.compareTo) String literal: " + (s1.compareTo(s2)));
		System.out.println("New s2 (.compareTo) String literal: " + (s2.compareTo(s1)) + "\n");

		// String combine
		String s = new StringBuffer().append("Akash").append("K G").toString();

		System.out.println("\t\tSTRING COMBINE");
		System.out.println("String combine using (+) : " + (s1 + s2));
		System.out.println("String combine using (concat) : " + (s1.concat(s2)));
		System.out.println(
				"String combine using (new StringBuffer().append(\"Akash\").append(\"K G\").toString()) : " + s + "\n");

		// String SubString
		System.out.println("String SubString using (Start value 1) : " + (s1.substring(1)));
		System.out.println("String SubString using (Start value 1, end value 5) : " + (s1.substring(2, 5) + "\n"));

		StringBuilder sbf = new StringBuilder();
		System.out.println(sbf.capacity());
		sbf.append("Akash KG");
		System.out.println("Capacity after adding : " + sbf + " " + sbf.capacity());
		sbf.append(" akashkarimpurathugopinath@gmail.com is my Email ID.");
		System.out.println("Capacity after adding : " + sbf + " " + sbf.capacity());

	}

}

class String_Builder {
	public void Basic_StringBuilder() {

		StringBuilder sb = new StringBuilder();
		System.out.println("Appended value is : " + sb.append("Akash"));
		System.out.println("Inserted value is : " + sb.insert(1, 'a'));
		System.out.println("Reverse value is : " + sb.reverse());
		System.out.println("Appended value is : " + sb.append(" KG"));
		System.out.println("Replaced value is : " + sb.replace(0, 6, "Akash"));
		System.out.println("After deleting, the value is : " + sb.delete(6, 9) + "\n");

		StringBuilder sbf = new StringBuilder();
		System.out.println(sbf.capacity());
		sbf.append("Hello");
		System.out.println("Capacity after adding : " + sbf + " " + sbf.capacity());
		sbf.append("java is my favourite language");
		System.out.println("Capacity after adding : " + sbf + " " + sbf.capacity());

	}

}

class String_Buffer {
	public void Basic_StringBuffer() {

	}

}

public class String_All {
	public static void main(String[] args) {

		// Strings
		String_A ob = new String_A();
		ob.Basic_String();

		// StringBuilder
		String_Builder ob1 = new String_Builder();
		ob1.Basic_StringBuilder();

		// StringBuffer
		String_Buffer ob2 = new String_Buffer();
		ob2.Basic_StringBuffer();

	}

}
