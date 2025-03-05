import java.util.Scanner;

class PhonebookManager {
    private ListNode head; // Reference to the head of the linked list

    public PhonebookManager() {
        head = null;
    }

    // Add a new contact to the end of the list
    public void add(String firstName, String lastName, String address, String number) {
        Contact newContact = new Contact(firstName, lastName, address, number);
        ListNode newNode = new ListNode(newContact);

        if (head == null) {
            head = newNode; // List was empty, so new node becomes the head
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode); // Append to the end of the list
        }
        System.out.println("Contact added successfully.");
    }

    // Delete a contact by last name
    public void delete(String lastName) {
        if (head == null) {
            System.out.println("The phonebook is empty.");
            return;
        }

        // Check if the head node is the one to delete
        if (head.getData().getLastName().equalsIgnoreCase(lastName)) {
            head = head.getNext(); // Move the head to the next node
            System.out.println("Contact deleted successfully.");
            return;
        }

        ListNode current = head;
        ListNode prev = null;
        while (current != null && !current.getData().getLastName().equalsIgnoreCase(lastName)) {
            prev = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Contact not found.");
        } else {
            prev.setNext(current.getNext()); // Remove the node
            System.out.println("Contact deleted successfully.");
        }
    }

    // Update a contact by last name
    public void update(String lastName, Scanner input) {
        ListNode current = head;

        while (current != null) {
            if (current.getData().getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Updating contact: " + current.getData());
                System.out.println("Enter new address: ");
                current.getData().setAddress(input.nextLine());
                System.out.println("Enter new phone number: ");
                current.getData().setNumber(input.nextLine());
                System.out.println("Contact updated successfully.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Contact not found.");
    }

    // Print all contacts in the phonebook
    public void printList() {
        if (head == null) {
            System.out.println("The phonebook is empty.");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
