Percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
   Apa yang terjadi? Mengapa bisa demikian?
   jawab : akan terjadi error (kesalahan tipe data) karena array bil dideklarasikan bertipe integer(int),      
           sedangkan nilai 5.0 dan 7.5 bertipe desimal (double).
           Tipe data int hanya dapat menyimpan bilangan bulat tanpa koma, jadi nilai desimal tidak dapat dimasukkan.

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

3. Ubah statement pada langkah No 4 menjadi seperti berikut
   jawab : keluaran tetap menampilkan seluruh isi array.
           penjelasannya : bil.length adalah array (jumlah elemen). jadi perulangan akan berjalan sebanyak panjang array, tanpa harus menulis batas angka secara manual.

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? 
   Mengapademikian?
   jawab : program akan error, karena indeks maksimal array bil hanya sampai 3 (karena panjangnya 4 elemen).
           Kondisi i <= 4 membuat program mencoba mengakses bil[4] yang tidak ada.

Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:, Jalankan program. Apakah terjadi perubahan?  
   Mengapa demikian?
   jawab : tidak ada perubahan hasil.
           karena perbedaannya hanya pada cara penulisan loop; selama logika sama (for dari 0 sampai < panjang array), hasil input tetap sama.

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? 
   jawab : artinya perulangan dilakukan selama nilai i lebih kecil dari jumlah elemen array.
           nilaiAkhir.length = banyaknya elemen array.
           dengan begitu, loop berhenti setelah elemen terakhir diproses.

3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
   hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
   > 70):
   Jalankan program dan jelaskan alur program!
   jawab : 
   1. program membaca semua nilai mahasiswa.
   2. saat menampilkan hasil hanya elemen dengan nilai > 70 yang dicetak.
   Alur : input - simpan dalam array - cek satu per satu - tampilkan jika >70.

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
   nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
   seperti ilustrasi output berikut:
   jawab : sudah

Percobaan 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)
   agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa
   yang memiliki lebih besar dari 70 (>70).
   jawab : sudah
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga
   program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan
   output seperti berikut ini:
   jawab : sudah 


Percobaan 4
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
   atas.
   jawab : break; digunakan untuk menghentikan perulangan secara langsung ketika nilai yang dicari sudah          
           ditemukan.
           tanpa break, program akan tetap melanjutkan pencarian ke seluruh elemen meskipun hasil sudah ditemukan.

2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima
   input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin
   dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil
   program:
   jawab : sudah

3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
   "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
   Contoh tampilan program sebagai berikut:
   jawab : sudah


