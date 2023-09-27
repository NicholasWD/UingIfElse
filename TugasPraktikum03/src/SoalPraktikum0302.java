
import java.util.Scanner;


public class SoalPraktikum0302 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        
        double laptop, buku, kotakp, hp;
        double brtL, brtB, brtK, brtH;
        brtL = 850.56;
        brtB = 250.11;
        brtK = 25.31;
        brtH = 200.00;
        
        double Ttl;
        int indeks = 0;
        
        System.out.println("=======Indeks Berat Barang Bawaan Tasku=======");
        System.out.print("Banyak Laptop: ");
        laptop = ipt.nextInt();
        System.out.print("Banyak Buku Tulis: ");
        buku = ipt.nextInt();
        System.out.print("Banyak Kotak Pensil: ");
        kotakp = ipt.nextInt();        
        System.out.print("Banyak Smartphone: ");
        hp = ipt.nextInt();
        
        Ttl = ((laptop * brtL) + (buku * brtB) + (kotakp * brtK) + (hp * brtH));
        
        System.out.println("==============================================");
        
        if (laptop < 0 || buku < 0 || kotakp < 0 || hp < 0){
            
            System.err.println("ERROR! - Tidak diperkenankan bilangan negatif!");        
            } else {
                if (Ttl == 0){
                    indeks = 0;
                    System.out.println("Indeks berat barang: " + indeks);
                } else if (Ttl > 0 && Ttl < 500){
                    indeks = 1;
                    System.out.println("Indeks berat barang: " + indeks);
                } else if (Ttl >= 500 && Ttl < 1000){
                    indeks = 2;
                    System.out.println("Indeks berat barang: " + indeks);
                } else if (Ttl >= 1000 && Ttl < 1500){
                    indeks = 3;
                    System.out.println("Indeks berat barang: " + indeks);
                } else if (Ttl >= 1500 && Ttl < 2000){
                    indeks = 4;
                    System.out.println("Indeks berat barang: " + indeks);
                } else if (Ttl > 2000){
                    indeks = 5;
                    System.out.println("Indeks berat barang: " + indeks);
                    System.out.println("Berat barang melebihi ketentuan");
                }
        if (indeks >= 0 && indeks <= 4 && indeks != 5){
            System.out.println("Bawaan barang tidak melebnihi ketentuan, aman!");
        }
            
        }
    }
}