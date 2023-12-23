package model;

public class Produk {
    private String TipeTugas;
    private int HargaTugas; 

    public Produk(String TipeTugas, int HargaTugas){
        this.TipeTugas = TipeTugas;
        this.HargaTugas = HargaTugas;
    }
    public String getTipeTugas(){
        return TipeTugas;
    }
    public int getHargaTugas(){
        return HargaTugas;
    }
}
