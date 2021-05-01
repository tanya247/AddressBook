import java.util.Scanner;
public class AddressBookMain {
	public static void main(String args[]) {
		ContactDirectory ac = new ContactDirectory();
		Scanner sc = new Scanner(System.in);
		ac.addContact();
		System.out.println("Enter 1 : Add contact");
		System.out.println("Enter 2 : edit contact ");
		System.out.println("Enter 3 : Delete Contact");
		System.out.println("Enter 4: Show contact");
		int choose = sc.nextInt();
		switch(choose) {
		//first name
		case 1 :
			ac.addContact();
			System.out.println("Contact added");
			break;
	
		case 2:
			ac.editContact();
			System.out.println("If you want to see contact directory press 1");
			int f = sc.nextInt();
			if (f==1) {
				ac.show();
			}
			else {
				System.out.println("Invalid Choice");
			}
			break;
		case 3:
			ac.deleteContact();
			System.out.println("If you want to see contact directory press 1");
			int fo = sc.nextInt();
			if (fo==1) {
				ac.show();
			}
			else {
				System.out.println("Invalid Choice");
			}
			break;
				
		case 4 :
			System.out.println("No. of contacts in the contact directory: ");
			ac.show();
			
		default:
			System.out.println("Invalid Choice");
			break;
			
		}	
		
	}
}