/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa1;

/**
 *
 * @author Hawinna
 */
// ================= KELAS DATA (Mahasiswa1) =================

public class Mahasiswa1 {

    // ===== Variabel Global / Atribut =====
    private String npm;   
    private String nama;  
    private String kelas; 

    // ===== Konstruktor Default =====
    public Mahasiswa1() {
        this.npm = "";
        this.nama = "";
        this.kelas = "";
    }

    // ===== Konstruktor Berparameter =====
    public Mahasiswa1(String npm, String nama, String kelas) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
    }

    // ===== Setter dan Getter =====
    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNpm() {
        return this.npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return this.kelas;
    }

    // ===== Method Tambahan =====
    public void tampilkanData() {
        System.out.println("NPM   : " + npm);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("------------------------------");
    }
}
