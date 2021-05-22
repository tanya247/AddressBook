import java.util.*;
public class MultipleAddressBook {
	public static void main(String args[]) {
		AddressBookMain abm = new AddressBookMain();
		Scanner scanner = new Scanner(System.in);
		HashMap <String , AddressBookMain > hmap = new HashMap <String ,AddressBookMain>();
		System.out.println("How many Address Book you want to add :");
		int numberOfAddressBooks = scanner.nextInt();
		scanner.nextLine();
		for (int i=0; i<numberOfAddressBooks; i++)
		{
			System.out.println("Please Enter the name of Address Book : ");
			String addressBookName =scanner.nextLine();
			abm.addressBookMain();
			System.out.println("Adressbook added");
			hmap.put(addressBookName , abm);
		}
	}
	
}
