# Unit Testing pada Whitebox menggunakan build tools
Repository ini berisi aplikasi kalkulator yang akan diguankan untuk melakukan pengujian whitebox dengan menggunakan buil tools Gradle.

## Spesifikasi Aplikasi Kalkulator
1. Project sederhana (kalkulator: tambah, kurang, kali, bagi) menggunakan
environment yang sudah dibuat dengan Main App:
● user melakukan operasi kalkulator dengan input dua buah operand
● user memilih operator yang mau digunakan untuk proses penghitungan
● aplikasi melakukan perhitungan dengan memanggil method komputasi
● aplikasi menampilkan hasilnya ke layar
2. Buat modul program yang terisolasi dari modul lain. Modul ini digunakan untuk
melakukan proses kalkulator (tambah, kurang, kali, bagi) dan 1 buah modul
komputasi yang menerima dua buah nilai angka, kemudian melakukan validasi dan
operasi perhitungan dengan method kalkulator yang sesuai, serta mengembalikan
hasilnya ke modul pemanggil.
3. Proses validasi meliputi:
a. nilai yang dihitung harus angka, tidak boleh karakter
b. angka yang dihitung berada pada range -32,768 hingga 32,767
c. operator yang boleh diinputkan adalah +, -, * (kali) dan / (bagi)
d. pada operasi pembagian, pembagi tidak boleh bernilai nol
e. proses validasi dilakukan secara berurutan, jika ada salah satu validasi yang
tidak sesuai, maka proses berhenti menghitung dan menampilkan pesan error
(Silahkan buat pesan errornya di expected result)
f. Namun, jika semua validasi benar, maka proses dilanjutkan menuju perhitungan
kalkulator sesuai dengan operator yang dipilih
