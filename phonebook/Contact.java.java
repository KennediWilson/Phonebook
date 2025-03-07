class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String number;

    public Contact(String firstName, String lastName, String address, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Address: " + address + ", Phone: " + number;
    }
}
