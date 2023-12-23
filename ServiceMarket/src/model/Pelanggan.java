package model;
import java.util.Scanner;

public class Pelanggan {
  Scanner input = new Scanner(System.in);
  String Nama;

  public Pelanggan() {
    System.out.println("Masukkan Nama Pelanggan:");
    this.Nama = input.nextLine();
  }
  public String getNamaPelanggan() {
    return this.Nama;
  }

  public void User(controller.TokoController TokoController, Produk Tugas) {
    System.out.println("Nama Pelanggan : " + getNamaPelanggan());
  }
}