import java.util.Scanner;
public class AddressBookMain {
	ContactDirectory ac = new ContactDirectory();
	public void addressBookMain() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do u wqant to proceed , say Yes/No");
		String ch = sc.next();
		while(ch.equals("Yes")) {
			addressBookOperations();
			System.out.println("Do u wqant to proceed , say Yes/No");
			ch = sc.next();
		}
		
	}
	public void addressBookOperations() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 : Add contact");
		System.out.println("Enter 2 : edit contact ");
		System.out.println("Enter 3 : Delete Contact");
		System.out.println("Enter 4: Show contact");
		System.out.println("Enter 5 : Search Contact");
		System.out.println("Enter 6 : Count Person");
		System.out.println("Enter 7 : Sort Person Alphabetically By name");
		int choose = sc.nextInt();
		switch(choose) {
			//first name
		case 1 :
			ac.addContact();
			break;
		case 2:
			ac.editContact();
			break;
		case 3:
			ac.deleteContact();
			break;
		case 4 :
			System.out.println("No. of contacts in the contact directory: ");
			ac.show();
			break;
		case 5:
			ac.searchContact();
			break;
		case 6:
			ac.countPerson();
			break;
		case 7:
			ac.sortNameAlphabetically();
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}
}