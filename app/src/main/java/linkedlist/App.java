package linkedlist;

public class App {
    public static void main(String[] args) {
        JunaLinkedList list = new JunaLinkedList();

        System.out.println("Insert at beginning: 20, 10");
        list.TambahDepan(20);
        list.TambahDepan(10);
        list.CetakList();
    
        System.out.println("Insert at end: 30, 40");
        list.TambahBelakang(30);
        list.TambahBelakang(40);
        list.CetakList();

        System.out.println("Search for 30:");
        System.out.println(list.search(30));

        System.out.println("Delete 20:");
        list.delete(20);
        list.CetakList();

        System.out.println("Delete 10:");
        list.delete(10);
        list.CetakList();

        System.out.println("Search for 100:");
        System.out.println(list.search(100));
    }
}
