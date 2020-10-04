import java.util.*;
public class AddressBookMain{
        List<Contact> addressBook = new ArrayList<Contact>();
		static Scanner sc=new Scanner(System.in);
		public void addContact() {
			
		Contact con=new Contact();
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
	 public void editContact(String name) {
        boolean symbol=true;
        for(Contact c:addressBook) {
            if(c.getFirstName().equals(name)) {
                while (symbol) {
                    System.out.println("To edit,select a Number:\n 1.firstName\n 2.lastName\n 3.address\n 4.zip\n 5.phoneNo\n 6.email\n 7.exit");
                    int select = sc.nextInt();
                    switch (select) {
                        case 1:
                        {System.out.println("Enter First Name:");
                            String firstname = sc.next();
                            c.setFirstName(firstname);
                            break;}

                        case 2:
                        {System.out.println("Enter Last Name:");
                            String lastname = sc.next();
                            c.setLastName(lastname);
                            break;}

                        case 3:
                        {System.out.println("Enter the Address:");
                            String addr = sc.next();
                            c.setAddress(addr);
                            break;}

                        case 4:
                        {System.out.println("Enter Zip:");
                            String zipcode = sc.next();
                            c.setZip(zipcode);
                            break;}

                        case 5:
                        {System.out.println("Enter Phone Number:");
                            String phone = sc.next();
                            c.setPhoneNo(phone);
                            break;}

                        case 6:
                        {System.out.println("Enter Email Id:");
                            String mail = sc.next();
                            c.setEmail(mail);
                            break;}

                        case 7:
                        {System.out.println("Exiting edit section");
                            symbol = false;
                            break;}

                        default:
                            System.out.println("Enter number from 1 to 7");
                    }
                }
            }else
                System.out.println("Contact with name "+name+" doesnot exist.");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Address Book Program");
        AddressBookMain adBook = new AddressBookMain();
        adBook.addContact();
        System.out.println("Enter name of contact to be edited:");
        String nam=sc.next();
        adBook.editContact(nam);

        }
    
}
