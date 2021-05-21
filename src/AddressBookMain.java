import java.util.Scanner;
public class AddressBookMain {
	public void addressBookMain(){
		ContactDirectory ac = new ContactDirectory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 : Add contact");
		System.out.println("Enter 2 : edit contact ");
		System.out.println("Enter 3 : Delete Contact");
		System.out.println("Enter 4: Show contact");
		System.out.println("Enter 5 : Search Contact");
		System.out.println("Enter 6 : Count Person");
		int choose = sc.nextInt();
		switch(choose) {
		//first name
		case 1 :
			ac.addContact();
			System.out.println("If you want to see contact directory press 1");
			System.out.println("If you want to edit contact directory press 2");
			System.out.println("If you want to delete contact directory press 3");
			System.out.println("If you want to search by city or state , press 4");
			System.out.println("If you want to count by city or state , press 5");
			int fm = sc.nextInt();
			if (fm==1) {
				ac.show();
			}
			if (fm==2) {
				ac.editContact();
			}
			if (fm==3) {
				ac.deleteContact();
			}
			if (fm == 4) {
				ac.searchContact();
			}
			if(fm == 5) {
				ac.countPerson();
			}
			
			break;
	
		case 2:
			ac.editContact();
			System.out.println("If you want to see contact directory press 1");
			System.out.println("If you want to delete contact directory press 2");
			System.out.println("If you want to search by city or state , press 3");
			System.out.println("If you want to count by city or state , press 4");
			int f = sc.nextInt();
			if (f==1) {
				ac.show();
			}
			if (f==2) {
				ac.deleteContact();
			}
			if(f==3) {
				ac.searchContact();
			}
			if(f==4) {
				ac.countPerson();
			}
			break;
		case 3:
			ac.deleteContact();
			System.out.println("If you want to see contact directory press 1");
			System.out.println("If you want to search by city or state , press 2");
			System.out.println("If you want to count by city or state , press 3");
			int fo = sc.nextInt();
			if (fo==1) {
				ac.show();
			}
			if (fo==2) {
				ac.searchContact();
			}
			if(fo == 3) {
				ac.countPerson();
			}
			break;
				
		case 4 :
			System.out.println("No. of contacts in the contact directory: ");
			ac.show();
			break;
		case 5:
			ac.searchContact();
			System.out.println("If you want to count by city or state , press 1");
			int fom = sc.nextInt();
			if(fom == 1) {
				ac.countPerson();
			}else {
				System.out.println("Invalid choice");
			
			}
			break;
		case 6:
			ac.countPerson();
			break;
		default:
			System.out.println("Invalid Choice");
			break;
			
		}	
		
	}
}