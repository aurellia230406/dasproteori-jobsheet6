import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/yang lain): ");
        String jenisBuku = input.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();
        
        System.out.print("Masukkan harga buku: ");
        double hargaBuku = input.nextDouble();
        
        double diskon = 0;

        if (jenisBuku.equals("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7; 
            if (jumlahBuku > 3) {
                diskon += 2; 
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5; 
            }
        }

        double totalHarga = hargaBuku * jumlahBuku;
        double totalDiskon = (totalHarga * diskon) / 100;
        double totalBayar = totalHarga - totalDiskon;

        System.out.printf("Jumlah diskon: %.2f\n", totalDiskon);
        System.out.printf("Total yang harus dibayar: %.2f\n", totalBayar);

    }
}