package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	private static final int Room = 0;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[9];
		
		System.out.println("Quantos quantos vão ser alugados ?:  ");

		int quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.println("Reserva de numero #"+(i+1));

			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto: ");
			int roomVect = sc.nextInt();
			
			vect[roomVect] = new Room(name, email);
		}
		
		System.out.println("Quartos reservados : ");
		System.out.println();
		
		for (int i = 0; i < 9; i++) {
			if ( vect[i] != null ) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		

	}

}
