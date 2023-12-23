package model;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Produk> newTugas;
    private ArrayList<Paket> newPaket;
    private int TotalHarga;

    public Transaksi (){
        newTugas = new ArrayList<>();
        newPaket = new ArrayList<>();
        TotalHarga = 0;
    }
    public void TambahTugas(Produk Tugas) {
        newTugas.add(Tugas);
        TotalHarga += Tugas.getHargaTugas();
    }
    public void TambahPaket (Paket Paket){
        newPaket.add(Paket);
        TotalHarga += Paket.getHargaPengerjaan();
    }
    public void Kuintansi(){
        System.out.println("=== Detail Transaksi ===");
        for (Produk Tugas : newTugas){
            System.out.println(Tugas.getTipeTugas() + "Rp." + Tugas.getHargaTugas());
              for(Paket Paket : newPaket){
            System.out.println(Paket.getTipePengerjaan() + "Rp." + Paket.getHargaPengerjaan());
        }
        }
      
        System.out.println("");
        System.out.println("Total Harga : Rp." + TotalHarga);
    }
}

