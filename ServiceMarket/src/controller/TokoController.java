package controller;

import java.util.Scanner;
import model.Produk;
import model.Paket;
import model.Transaksi;
import model.Penjoki;
import model.Pelanggan;


public class TokoController {
    private Transaksi Transaksi;
    private Penjoki Penjoki;
    private Paket Paket;
    private Pelanggan Pelanggan;

    public TokoController(Penjoki Penjoki, Pelanggan Pelanggan) {
        this.Penjoki = Penjoki;
        this.Pelanggan = Pelanggan;
        Transaksi = new Transaksi();
    }
    public void TambahTugas(Produk Tugas) {
        Transaksi.TambahTugas(Tugas);
    }
     public void TambahPaket(Paket Paket) {
        Transaksi.TambahPaket(Paket);
    }
    public void Kuintansi() {
        Transaksi.Kuintansi();
    }
    public void Transaksi(Produk Tugas) {
        Penjoki.Transaksi(this, Tugas);
        Pelanggan.User(this, Tugas);
    }
    public void Pemesanan(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Pilih Tugas");
            System.out.println("1. Tugas Resume Rp.5000" );
            System.out.println("2. Tugas Laporan Praktikum Rp.25000");
            System.out.println("3. Tugas Makalah Rp.15000");
            System.out.println("4. Tugas Power Point Rp.10000");
            System.out.println("5. Tugas Coding Rp.50000");
            System.out.println("0. Pesanan Selesai");

            int pilihanTugas = scanner.nextInt();
            
            if (pilihanTugas == 0){
                break;
            }
            do {
                System.out.println("Pilih Paket");
                System.out.println("1. Paket Ekspress Rp.10000");
                System.out.println("2. Paket Reguler Rp.0");
                System.out.println("0. Pesanan Selesai");

                int pilihanPaket = scanner.nextInt();

                if (pilihanPaket == 0){
                    break;
                }

                Produk Tugas = null;

                switch (pilihanTugas) {
                    case 1:
                        Tugas = new Produk("Tugas Resume ", 5000 );
                        break;
                    case 2:
                        Tugas = new Produk("Tugas Laporan Praktikum ", 25000);
                        break;
                    case 3:
                        Tugas = new Produk("Tugas Makalah ", 15000);
                        break;
                    case 4:
                        Tugas = new Produk("Tugas Power Point ", 10000);
                        break;
                    case 5:
                        Tugas = new Produk("Tugas Coding ", 50000);
                        break;
                    default:
                        System.out.println("Invalid, Try Again");
                        continue;
                }
                if (pilihanPaket == 0){
                    break;
                }

                Paket Paket = null;

                switch (pilihanPaket) {
                    case 1:
                    Paket = new Paket("Paket Ekspress", 10000);
                    break;
                    case 2:
                    Paket = new Paket("Paket Reguler", 0);
                    break;
                    default:
                    System.out.println("Invalid, Try Again");
                    continue;
                }
                
                Transaksi(Tugas);
                TambahPaket(Paket);
                System.out.println("Tambah Pesanan Baru");
                break;

            } while (true);

        } while (true);

        System.out.println("Pesanan Diterima, Terima Kasih Atas Kepercayaan Anda");
        Kuintansi();
    }
}
