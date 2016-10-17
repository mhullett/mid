package mid3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Midterm3 {

	public static void main(String[] args) {
		int key;
		String message = null;

		System.out.println("Enter a mesage to encrypt. ");
		Scanner kb = new Scanner(System.in);
		message = kb.nextLine();

		System.out.println("Enter a key. ");
		key = Integer.parseInt(kb.nextLine());

		FileOutputStream file = null;
		DataOutputStream write = null;
		try {
			file = new FileOutputStream("secret.msg");
			write = new DataOutputStream(file);
		} catch (FileNotFoundException e) {

			System.out.println("FILE NOT FOUND! ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (key > 0 && key > 100) {
			System.out.print("Key must be between 0 and 100 ");
			key = kb.nextInt();

		}
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);

			try {
				write.write(ch + key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
