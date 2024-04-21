# Unit Testing pada Whitebox menggunakan build tools
Repository ini berisi aplikasi kalkulator yang akan diguankan untuk melakukan pengujian whitebox dengan menggunakan build tools Gradle.

## Spesifikasi Aplikasi Kalkulator
1. Project sederhana (kalkulator: tambah, kurang, kali, bagi) menggunakan
environment yang sudah dibuat dengan Main App:
* user melakukan operasi kalkulator dengan input dua buah operand
* user memilih operator yang mau digunakan untuk proses penghitungan
* aplikasi melakukan perhitungan dengan memanggil method komputasi
* aplikasi menampilkan hasilnya ke layar
2. Buat modul program yang terisolasi dari modul lain. Modul ini digunakan untuk
melakukan proses kalkulator (tambah, kurang, kali, bagi) dan 1 buah modul
komputasi yang menerima dua buah nilai angka, kemudian melakukan validasi dan
operasi perhitungan dengan method kalkulator yang sesuai, serta mengembalikan
hasilnya ke modul pemanggil.
3. Proses validasi meliputi:
  - nilai yang dihitung harus angka, tidak boleh karakter
  - angka yang dihitung berada pada range -32,768 hingga 32,767
  - operator yang boleh diinputkan adalah +, -, * (kali) dan / (bagi)
  - pada operasi pembagian, pembagi tidak boleh bernilai nol
  - proses validasi dilakukan secara berurutan, jika ada salah satu validasi yang tidak sesuai, maka proses berhenti menghitung dan menampilkan pesan error (Silahkan buat pesan errornya di expected result)
  - Namun, jika semua validasi benar, maka proses dilanjutkan menuju perhitungan kalkulator sesuai dengan operator yang dipilih

## Teknologi yang digunakan
- Bahasa Pemrograman: Java v19
- Build Tool: Gradle v8.5
- Code Editor: VSCode
- Testing Tool: JUnit

## Prerequisite
- Java v19
- Code editor, disarankan VSCode
- Gradle v8.5

## Struktur File
Script program berada pada path src\main\java\com\calculator, yang berisi:
 - Class Main.java
 - Class Kalkulator.java
 - Class ProsesKalkulator.java

Script testing berada pada path src\test\java\com\calculator, yang berisi:
- Class KalkulatorTest.java
- Class MainTest.java
- Class ProsesKalkulatorTest.java

Selain itu, report hasil generate tools berada pada path build\reports, hasil reportnya dapat dilihat dengan membuka file html pada path build\reports\tests\test\index.html

## Instalasi
1. Clone repo ini dengan perintah:
	```
	https://github.com/sendist/Calculator.git
	```
2. Masuk ke folder proyek:
	```
	cd simple-calculator
	```
3. Build proyek dengan perintah:
	```
	./gradlew build
	```
## Menjalankan Aplikasi
Untuk menjalankan aplikasi, jika menggunakan VSCode, maka dapat langsung menekan tombol run pada pojok kanan atas, atau jika ingin dengan perintah pada terminal maka jalankan:
```
java -jar build\libs\Calculator-1.0-SNAPSHOT.jar
```

## Menjalankan Test Aplikasi
Untuk melakukan test aplikasi secara keseluruhan, gunakan perintah berikut:
```
./gradlew test
```
Untuk menjalankan test aplikasi pada unit tertentu, gunakan perintah seperti berikut:
```
./gradlew clean test --tests com.calculator.<Nama Class>.<Nama method>
```
Contoh, untuk menjalankan test pada class Kalkulator dan pada method isValid(), maka perintahnya adalah:
```
./gradlew clean test --tests com.calculator.KalkulatorTest.testIsValid
```

## Membuat Test Report 
Untuk membuat test report, pertama-tama pastikan aplikasi telah ter-build, gunakan perintah berikut untuk build aplikasi:
```
./gradlew build
```
Setelah itu jalankan test pada aplikasi dengan perintah:
```
./gradlew test
```
Setelah itu buka file index.html pada path build\reports\tests\test\index.html, maka test report dapat diakses, berikut adalah tampilan dari test report:
![Test Report](testReport.jpg)

## Anggota Kelompok
Kami kelompok B5 dari kelas 3B-D4 Teknik Informatika Politeknik Negeri Bandung
1. Muhammad Daffa Raihandika (211524050) (username github: daffaraihandika)
2. Reza Ananta Permadi Supriyo	(211524059) (username github: rzanta)
3. Sendi Setiawan (211524062) (username github: sendist)																		
																				

