package mid3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		int key;
		String Message;
		System.out.println("Enter the seckret key. ");
		Scanner kb = new Scanner(System.in);
		key = kb.nextInt();
		FileInputStream fis = null;
		DataInputStream in = null;
		try {
			fis = new FileInputStream("secret.msg");
			in = new DataInputStream(fis);
			int data;
			try {
				while ((data = fis.read()) != -1) {
					System.out.print("The Message is "+data +key);
					
				}
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			System.out.println("FILE NOT FOUND! ");

		}

	}
}
