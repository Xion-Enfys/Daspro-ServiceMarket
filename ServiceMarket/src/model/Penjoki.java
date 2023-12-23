package model;

public class Penjoki {
    private String Nama;

    public Penjoki (String Nama){
        this.Nama = Nama;
    }
    public String getNamaPenjoki(){
        return Nama;
    }
    public void Transaksi(controller.TokoController TokoController, Produk Tugas ){
        System.out.println("Nama Penjoki : " + getNamaPenjoki());
        TokoController.TambahTugas(Tugas);
        TokoController.Kuintansi();
    }
}
