import java.util.Scanner;

public class SoalPraktikum0303 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        int brng, ttlbrng, cashback, jmlh;
        brng = 0;
        
        System.out.println("========= Selamat Datang di Toko Charlie ========");
        System.out.print("Banyak Pembelian Barang: ");
        brng = ipt.nextInt();
        
        ttlbrng = brng / 3;
        cashback = (brng / 7) * 5500;
        
        
        System.out.println("=================================================");
        if (brng >= 0){
            if (cashback < 5500){
                System.out.println("Cashback: -");
            } else {
                System.out.println("Cashback: Rp." + cashback);
            }

            if (ttlbrng == 0){
                System.out.println("Tambahan barang: -");
            } else {
                System.out.println("Tambahan barang: " + ttlbrng);
            }
            
            jmlh = brng + ttlbrng;
        
        System.out.println("Jumlah barang: " + jmlh);
        } else {
            System.out.println("ERROR! - Inputan harus lebih dari 0");
        }
    }
}
