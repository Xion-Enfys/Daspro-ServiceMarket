package model;

public class Paket {
    private String TipePengerjaan;
    private int HargaPengerjaan;
   
    public Paket(String TipePengerjaan, int HargaPengerjaan){
        this.TipePengerjaan = TipePengerjaan;
        this.HargaPengerjaan = HargaPengerjaan;
    }
    public String getTipePengerjaan(){
        return TipePengerjaan;
    }
    public int getHargaPengerjaan(){
        return HargaPengerjaan;
    }
}