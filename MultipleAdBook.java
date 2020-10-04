import java.util.*;
public class MultipleAdBook{
    static HashMap<String, List<Contact>> multi=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        boolean exit =true;
        while(exit) {
            System.out.println("Add Address Book to Shelf\nEnter the name for Address Book:");
                        String name=sc.next();
                        if(multi.containsKey(name)) {
                            System.out.println("Key already exists.");
                        }
                        else {
                            AddressBookMain adBooks= new AddressBookMain();
                            adBooks.addContact();
                            multi.put(name, adBooks.addressBook);
                            System.out.println("Address book added to shelf");
                            exit=false;
                        }
                    }

        }
}