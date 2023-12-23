import java.util.Scanner;
import model.Penjoki;
import model.Transaksi;
import model.Pelanggan; 

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pelanggan pelanggan = new Pelanggan();

        Penjoki[] PenjokiArray = {
            new model.Penjoki("Idhoo"),
            new model.Penjoki("Desmia"),
            new model.Penjoki("Satria")
        };

        System.out.println("Nama Pelanggan ");
        System.out.println("Pilihan Penjoki");
        for (int i = 0; i < PenjokiArray.length; i++) {
            System.out.println((i + 1) + ". " + PenjokiArray[i].getNamaPenjoki());
        }
        int pilihanPenjoki = scanner.nextInt();

        if (pilihanPenjoki < 1 || pilihanPenjoki > PenjokiArray.length) {
            System.out.println("Pilihan pelayan tidak valid.");
            return;
        }
        model.Penjoki Penjoki = PenjokiArray[pilihanPenjoki - 1];

        controller.TokoController TokoController = new controller.TokoController (Penjoki, pelanggan);

        TokoController.Pemesanan();
    }
}
