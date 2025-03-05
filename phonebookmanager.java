import java.util.*;

class PhonebookManager {
    private LinkedList<Contact> contacts;

    public PhonebookManager() {
        contacts = new LinkedList<>();
    }

    public void add(String firstName, String lastName, String address, String number) {
        contacts.add(new Contact(firstName, lastName, address, number));
        System.out.println("Contact added successfully.");
    }

    public void delete(String lastName) {
        Iterator<Contact> iterator = contacts.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                found = true;
                System.out.println("Contact deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void update(String lastName, Scanner input) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Updating contact: " + contact);
                System.out.println("Enter new address: ");
                String newAddress = input.nextLine();
                System.out.println("Enter new phone number: ");
                String newNumber = input.nextLine();
                contact.setAddress(newAddress);
                contact.setNumber(newNumber);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void printList() {
        if (contacts.isEmpty()) {
            System.out.println("The phonebook is empty.");
        } else {
            contacts.forEach(System.out::println);
        }
    }
}
