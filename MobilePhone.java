package aditya;
import com.aditya.Contact;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    ArrayList <Contact>myContacts;

    public MobilePhone(String myNumber){
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
           // System.out.println("Name already exists");
            return false;
        }
        return myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
       if(findContact(oldContact) >= 0){
           return myContacts.remove(oldContact) && myContacts.add(newContact);
       }
        return false;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(Contact queryContact){
        for (int i=0; i < myContacts.size();i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(Contact contactName){
        if(findContact(contactName) < 0){
            return false;
        }
         return myContacts.remove(contactName);
    }

    public Contact queryContact(String contactName){
        for(int i=0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
                if(contact.getName().equals(contactName)){
                    return contact;
                }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List : ");
        for(int i = 0; i < myContacts.size();i++){
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
