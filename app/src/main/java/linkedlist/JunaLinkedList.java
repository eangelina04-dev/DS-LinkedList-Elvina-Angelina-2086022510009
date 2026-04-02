package linkedlist;

public class JunaLinkedList {
    JunaNode head;
    
    public JunaLinkedList(){
        this.head = null;
    }

    public void TambahDepan(int data){
        JunaNode newNode = new JunaNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void CetakList(){
        JunaNode current = head;
        
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println("null");
    }

    public void TambahBelakang(int data){
        JunaNode newNode = new JunaNode(data);

        if(head == null) {
            head = newNode;
            return;
        }
    

        JunaNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
    }

    public boolean search(int key) {
        JunaNode current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
        }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        JunaNode current = head;

        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
        }
    }
}