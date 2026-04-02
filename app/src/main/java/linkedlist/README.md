1. Karena data Linked List tersimpan secara acak di memori (tidak berurutan seperti Array), komputer tidak akan tahu di mana list itu dimulai jika kita tidak menyimpan alamat node pertama di variabel head. Jika head hilang, maka seluruh list tersebut hilang dari ingatan program. Makannya dalam program, fungsi CetakList(), search(), atau delete(). Semuanya dimulai dengan baris JunaNode current = head; untuk memberitahu si komputer bahwa letak mulainya disini.

2. Tanpa next, setiap node hanyalah potongan data yang berdiri sendiri-sendiri. next menyimpan alamat memori node selanjutnya, sehingga kita bisa menelusuri data dari awal hingga bertemu null (ujung list).

3. Pada Linked List, menambah data di depan hanya membutuhkan 2 langkah, tidak peduli seberapa banyak datanya. Prosesnya dapat dilihat di program (Method TambahDepan):
- Buat node baru (newNode).
- Pindahkan label head ke node baru (newNode = head kemudian head = newNode).
Makanya cepat sekali karena tidak ada yang perlu dipindahkan. Makanya time complexitynya O(1).

Perbandingannya dengan Array:
Jika ada Array dengan 1.000 data dan ingin menambah data di posisi paling depan (index 0), kamu harus menggeser 1.000 data tersebut satu per satu ke kanan. Makanya time complexitynya O(n).

4. Karena jika urutannya dibalik, isi LinkedList akan hilang semua. Ini berhubungan dengan bentuk LinkedList yang kayak kereta.  Jadi jika head = newNode dijalankan duluan, variabel head akan langsung berpindah ke node baru sebelum sempat menyambungkannya ke sisa list, sehingga alamat memori dari seluruh data lama akan terhapus dan tidak bisa diakses lagi oleh program. Singkatnya, semua node yang dulu tersambung di belakang head yang lama hilang karena saat perintah head = newNode, variabel head langsung melupakan alamat node pertama yang lama dan dioverwrite dengan dirinya sendiri.

5. Jika tertulis while (current.next != null), maka nilai terakhir pada list tidak akan tercetak. Hal ini terjadi karena perulangan akan langsung berhenti begitu program mencapai node terakhir (di mana next-nya bernilai null), sehingga kode di dalam loop tidak sempat dijalankan untuk node tersebut. Selain itu, jika list dalam keadaan kosong (head == null), program akan mengalami error (NullPointerException) karena ia mencoba mengecek next dari sesuatu yang tidak ada.

6. Array sangat jauh lebih baik untuk Fast Random Access karena cara menemukan sebuah data dalam Array hanya melalui penulisan indexnya. Sedangkan, untuk menemukan data dalam LinkedList, dimulai dari head dan melakukan perulangan next sampai ketemu datanya.

7. LinkedList lebih efisien daripada Array untuk Insertion at Beginning karena cukup dilihat dari Time Complexitynya, untuk LinkedList O(1) dan Array O(n). Linkedlist hanya perlu 2 langkah dengan membuat node baru dan pindahkan label head ke node tersebut. Sedangkan, di Array, jika mau insertion at beginning, kamu harus menggeser seluruh data yang sudah ada ke kanan satu per satu untuk memberi ruang kosong.

8. LinkedList memakai lebih banyak memori daripada array karena untuk satu data, array hanya menyimpan 1 slot untuk murni nilai data tersebut sedangkan LinkedList menyimpan 2 slot per node, slot 1 sebagai tempat menyimpan angkanya (dalam program: int data), sedangkan slot 2 sebagai tempat menyimpan alamat ke node berikutnya (dalam program: JunaNode next)