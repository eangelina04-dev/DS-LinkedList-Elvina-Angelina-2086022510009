1. Karena data Linked List tersimpan secara acak di memori (tidak berurutan seperti Array), komputer tidak akan tahu di mana list itu dimulai jika kita tidak menyimpan alamat node pertama di variabel head. Jika head hilang, maka seluruh list tersebut hilang dari ingatan program. Makannya dalam program, fungsi CetakList(), search(), atau delete(). Semuanya dimulai dengan baris JunaNode current = head; untuk memberitahu si komputer bahwa letak mulainya disini.

2. Tanpa next, setiap node hanyalah potongan data yang berdiri sendiri-sendiri. next menyimpan alamat memori node selanjutnya, sehingga kita bisa menelusuri data dari awal hingga bertemu null (ujung list).

3. Pada Linked List, menambah data di depan hanya membutuhkan 2 langkah, tidak peduli seberapa banyak datanya. Prosesnya dapat dilihat di program (Method TambahDepan):
- Buat node baru (newNode).
- Pindahkan label head ke node baru (newNode = head kemudian head = newNode).
Makanya cepat sekali karena tidak ada yang perlu dipindahkan. Makanya time complexitynya O(1).

Perbandingannya dengan Array:
Jika ada Array dengan 1.000 data dan ingin menambah data di posisi paling depan (index 0), kamu harus menggeser 1.000 data tersebut satu per satu ke kanan. Makanya time complexitynya O(n).

4. Karena jika urutannya dibalik, isi LinkedList akan hilang semua. Ini berhubungan dengan nomor 3, misalkan  