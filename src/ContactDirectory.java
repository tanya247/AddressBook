import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;


public class ContactDirectory{
	String firstName,lastName,address,city,state,email,m;
    int zip;
    long phoneNo;
    Scanner scanner = new Scanner(System.in);
    ArrayList <AddressBook> contacts = new ArrayList <AddressBook>(); 
   
    
    public void addContact() {
    	System.out.println("No. of contacts in the contacts you want to add");
    	int n = scanner.nextInt();
    	for(int i = 0; i<n;i++) {
	        System.out.println("Enter the first name:");
		    String firstName = scanner.next();
		    
		    System.out.println("Enter the last name :");
		    String lastName = scanner.next();
		    if (contacts.stream().anyMatch(
					person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))) {
				System.out.println(firstName + " "+lastName + " is already exixts !");
			
			}
		    else {
			    System.out.println("Enter the address :");
			    String address = scanner.next();
			    
			    System.out.println("Enter the city :");
			    String city = scanner.next();
			    
			    System.out.println("Enter the state :");
			    String state = scanner.next();
			    
			    System.out.println("Enter the email :");
			    String email = scanner.next();
			    
			    System.out.println("Enter the mobile number :");
			    long phoneNo = scanner.nextLong();
			    
			    System.out.println("Enter the zip :");
			    int zip = scanner.nextInt();
			   
			    contacts.add(new AddressBook(firstName, lastName, address, city,
		                state, phoneNo, email, zip));
			    System.out.println("Contact added");
		    }
    	}
    }
    public void editContact() {
    	System.out.println("Enter First Name");
    	
    	String Name = scanner.next();
    	if (contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
    	else {
	    	for(int i = 0 ; i<contacts.size();i++) {
	    		m = contacts.get(i).getFirstName();
	    		
				if(m.equalsIgnoreCase(Name)) {
					System.out.println("Enter updated first name:");
					String fname = scanner.next();
					System.out.println("Enter updated last name :");
					String lname = scanner.next();
					System.out.println("Enter updated address :");
			    	String addr = scanner.nextLine();
			    	System.out.println("Enter updated city :");
			    	String cit = scanner.next();
			    	System.out.println("Enter updated state:");
			    	String stat = scanner.next();
			    	System.out.println("Enter updated email:");
			    	String ema = scanner.next();
			    	System.out.println("Enter updated pin code :");
			    	int zp = scanner.nextInt();
			    	System.out.println("Enter updated Phone Number :");
			    	long phone = scanner.nextLong();
			    	
					contacts.get(i).setFirstName(fname);
					contacts.get(i).setLastName(lname);
					contacts.get(i).setAddress(addr);
					contacts.get(i).setCity(cit);
					contacts.get(i).setState(stat);
					contacts.get(i).setEmail(ema);
					contacts.get(i).setPhoneNo(phone);
					contacts.get(i).setZip(zp);
			        System.out.println("contact updated");
				}
				else {
						System.out.println("Name not found");
				}
	    	}
    	}
    }
    public void deleteContact() {
    	System.out.println("Enter First Name");
    	String Name = scanner.next();
    	if (contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
    	else {
    		for(int i = 0 ; i<contacts.size();i++) {
	    		m = contacts.get(i).getFirstName();
	    		
				if(m.equalsIgnoreCase(Name)) {
					contacts.remove(i);
					System.out.println("contact deleted");
				}
				else {
					System.out.println("Name not found");
				}	
    		}
    	}
    }
    public ArrayList<AddressBook> getContact() {
		return contacts;
	}
    public void searchContact() {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Search by City or State ");
    	System.out.println("Enter 1 for Search by city");
    	System.out.println("Enter 2 for Search by State");
    	ArrayList<AddressBook> contacts = this.getContact();
    	int m = sc.nextInt();
    	if (contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
    	else {
    		if (m == 1) {
				System.out.println("Enter the City name :");
				String cityName = sc.next();
				Dictionary cityDictionary = new Hashtable();

				contacts.stream().filter(map -> map.getCity().contains(cityName)).forEach(addressBook -> cityDictionary.put(addressBook.getName(),cityName));
				System.out.println("City Name: " + cityName);

				for (Enumeration p = cityDictionary.keys(); p.hasMoreElements();) {

					System.out.println("Name:" + p.nextElement());

				}
			} else if(m == 2) {
				System.out.println("Enter the State name :");
				String stateName = sc.next();
				Dictionary stateDictionary = new Hashtable();

				contacts.stream().filter(map -> map.getState().contains(stateName)).forEach(addressBook -> stateDictionary.put(addressBook.getName(),stateName));
				System.out.println("City Name: " + stateName);

				for (Enumeration p = stateDictionary.keys(); p.hasMoreElements();) {

					System.out.println("Name:" + p.nextElement());

				}
			}else {
				System.out.println("Invalid choice");
			}
    	}
    }
    public void countPerson() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Count by City or State ");
    	System.out.println("Enter 1 for count by city");
    	System.out.println("Enter 2 for count by State");
    	ArrayList<AddressBook> contacts = this.getContact();
    	int m = sc.nextInt();
    	if (contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
    	else {
    		if (m == 1) {
				System.out.println("Enter the City name :");
				String cityName = sc.next();
				int countByCity = (int) contacts.stream()
						.filter(person -> person.getCity().equalsIgnoreCase(cityName)).count();
				System.out.println(countByCity);
    		}else if(m == 2) {
    			System.out.println("Enter the State name :");
				String stateName = sc.next();
				int countByCity = (int) contacts.stream()
						.filter(person -> person.getState().equalsIgnoreCase(stateName)).count();
				System.out.println(countByCity);
    		}
    	}
    }
    public void sortedEntries() {
    	System.out.println("Sorted enteries according to diiferent attributes:-  ");
    	System.out.println("Enter 1 - Sorted By Person Name");
    	System.out.println("Enter 2 - Sorted By City Name");
    	System.out.println("Enter 3 - Sorted By State Name");
    	System.out.println("Enter 4 - Sorted By Zip Name");
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	ArrayList<AddressBook> contacts = this.getContact();
    	if(m==1) {
    		List<AddressBook> sortedList = contacts.stream().sorted(Comparator.comparing(AddressBook::getName)).collect(Collectors.toList());
	        for(AddressBook contact:sortedList){
	        	System.out.println("Name: "+contact.getName());
	        }
	    }
    	else if(m==2) {
    		List<AddressBook> sortedList = contacts.stream().sorted(Comparator.comparing(AddressBook::getCity)).collect(Collectors.toList());
	        for(AddressBook contact:sortedList){
	        	System.out.println("City: "+contact.getCity());
	        	System.out.println("Name: "+contact.getName());
	        }
	    }
    	else if(m==3) {
    		List<AddressBook> sortedList = contacts.stream().sorted(Comparator.comparing(AddressBook::getState)).collect(Collectors.toList());
	        for(AddressBook contact:sortedList){
	        	System.out.println("State: "+contact.getState());
	        	System.out.println("Name: "+contact.getName());
	        }
	    }
    	else if(m==4) {
    		List<AddressBook> sortedList = contacts.stream().sorted(Comparator.comparing(AddressBook::getZip)).collect(Collectors.toList());
	        for(AddressBook contact:sortedList){
	        	System.out.println("Zip: "+contact.getZip());
	        	System.out.println("Name: "+contact.getName());
	        }
	    }
    	
    }
    public void show() {
    	System.out.println("No. of contacts in the contact directory: " +contacts.size());
		for(int i = 0 ; i<contacts.size();i++) {
			System.out.println("First Name is : "+contacts.get(i).getFirstName());
			System.out.println("Last Name is: "+contacts.get(i).getLastName());
			System.out.println("Address is: "+contacts.get(i).getAddress());
			System.out.println("City is: "+contacts.get(i).getCity());
			System.out.println("State is: "+contacts.get(i).getState());
			System.out.println("Email is: "+contacts.get(i).getEmail());
			System.out.println("Phone Number is: "+contacts.get(i).getPhoneNo());
			System.out.println("Pin code is: "+contacts.get(i).getZip());
		}
    }
    
}
        