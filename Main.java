// Asosiasi
// class MataKuliah {
//     String kode;
//     String nama;

//     MataKuliah (String kode, String nama) {
//         this.kode = kode;
//         this.nama = nama;
//     }
// }



// class Mahasiswa {
//     private String nama;
//     private String nim;
//     private int semester;

//     Mahasiswa(String nama, String nim, int semester){
//         this.nama = nama;
//         this.nim = nim;
//         this.semester = semester;
//     }

//     public void setNama(String nama){
//         this.nama = nama;
//     }
//     public void setNim (String nim) {
//         this.nim = nim;
//     }
//     public void setSemester(int semester) {
//         this.semester = semester;
//     }


//     public String getNama(){
//         return nama;
//     }
//     public String getNim(){
//         return nim;
//     }
//     public int getSemester() {
//         return semester;
//     }

//     public void mengambilMatkul (MataKuliah mk) {
//         System.out.println("Nama mahasiswa: " +nama );
//         System.out.println("NIM: "+nim);
//         System.out.println("Semester :"+ semester);
//         System.out.println("MEngambil MK: "+ mk.kode +" " + mk.nama);

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Mahasiswa mhs = new Mahasiswa("Hermon Ginting", "125140014", 3);
//         MataKuliah mk = new MataKuliah("IF25-10023", "Pemrograman Berorientasi Objek");
//         mhs.mengambilMatkul(mk);
//     }
    
// }

//aggregation

// class Mahasiswa{
//     String nama;
//     String nim;;

//     Mahasiswa (String nama, String nim){
//         this.nama = nama;
//         this.nim = nim;;
//     }

//     public void tampilData(){
//         System.out.println(nama + " " + nim);
//     }
// }


// class KelasPraktikum {
//     String namaKelas;
//     Mahasiswa [] mahasiswas;

//     KelasPraktikum(String namaKelas, Mahasiswa[] mahasiswas) {
//         this.namaKelas = namaKelas;
//         this.mahasiswas = mahasiswas;
//     }

//     public void tampilkanKelas() {
//         System.out.println("Kelas Praktikum :" + namaKelas);
//         System.out.println("Nama mahasiswa :");
//         for (Mahasiswa m : mahasiswas) {
//             m.tampilData();
//         }
//     }
// }

// public class Main {
//     public static void main (String [] args) {
//         Mahasiswa m1 = new Mahasiswa("Hermon Ginting", "125140014");
//         Mahasiswa m2 = new Mahasiswa("Yanti", "125140015");
//         Mahasiswa m3 = new Mahasiswa("Yayan", "125140016");
//         Mahasiswa[] daftarMahasiswas = {m1, m2, m3}; 
//         KelasPraktikum kelas = new KelasPraktikum("Praktikum PBO-RA", daftarMahasiswas);
//         kelas.tampilkanKelas();
//     }
// }

// class Gedung {
//     String gedung;

//     Gedung (String gedung) {
//         this.gedung = gedung;
//     }

//     public void RuangKelas () {
//         System.out.println(gedung);
//     }
// }

// class ruangKealas{
//     String lantai;
//     String nomor;
//     Gedung gedung;

//     ruangKealas(String lantai, String nomor){
//         this.lantai = lantai;
//         this.nomor = nomor;
//         this.gedung = new Gedung("GK2");

//     }
//     public void tampilkanKelasLengkap(){
//         System.out.println( lantai +" "+ nomor);
//         gedung.RuangKelas();
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         ruangKealas rk = new ruangKealas("2", "228");
//         rk.tampilkanKelasLengkap();

//         rk = null;
//     }
// }