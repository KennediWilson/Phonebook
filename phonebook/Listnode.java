class ListNode {
    private Contact data; // Each node stores a Contact object
    private ListNode next; // Reference to the next node

    public ListNode(Contact data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }

    public Contact getData() {
        return data;
    }

    public void setData(Contact data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
