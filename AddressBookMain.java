import java.util.*;
public class AddressBookMain{
    public static void main(String[] args){
         System.out.println("Welcome to Address Book Program");
	     Scanner sc=new Scanner(System.in);
		 Contact con=new Contact();
        List<Contact> addressBook = new ArrayList<Contact>();
        char want='Y';
        while(want=='Y'){
            System.out.println("Enter Contact Details\nEnter First Name:");
                con.setFirstName(sc.next());
            System.out.println("Enter Last Name:");
                con.setLastName(sc.next());
            System.out.println("Enter Address:");
                con.setAddress(sc.next());
            System.out.println("Enter Zip Code:");
                con.setZip(sc.next());
            System.out.println("Enter Phone Number:");
                con.setPhoneNo(sc.next());
            System.out.println("Enter Email Address:");
                con.setEmail(sc.next());
            System.out.println("Want to add new Contact? (Y/N ):");
            want=sc.next().charAt(0);
            addressBook.add(con);
		}
    }
}