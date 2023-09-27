import java.util.Scanner;

public class SoalPraktikum0304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beli, menit, stok;
        double mnt, diskon, hsl, hasil, total;
        stok = 150;
        
        System.out.println("========= Toko Buah A =========");
        
        System.out.print("Enter jumlah pembelian: ");
        beli = input.nextInt();
        System.out.print("Enter menit: ");
        menit = input.nextInt();
        
        System.out.println("===============================");
        
        if (menit > 0 && beli > 0 && menit <= 420){
            mnt = menit / 40;
            diskon = (mnt * 5) / 100;
            hasil = beli * 100000;
            hsl = hasil * diskon;
            total = hasil - hsl;
        
            System.out.println("Jumlah pembelian: " + beli);
            System.out.println("Stok tersisa: " + (stok - beli));
            System.out.println("Hasil pembelian: Rp. " + total);
            
        } else if (beli > 0 && menit >= 420){
            System.out.println("Toko telah Tutup!");
        } else if (beli <= 0 || menit <= 0){
            System.out.println("ERROR - Inputan Invalid!");
        }
    }
}