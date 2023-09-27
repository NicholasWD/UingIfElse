import java.util.Scanner;


public class TugasPraktikum03 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        
        int nilai;
        
        System.out.print("Untuk memulai program, masukkan nilai yang berkelipatan 5 dan bilangan ganjil = ");
        nilai = ipt.nextInt();
        
        if (nilai % 5 == 0 && nilai % 2 != 0){
            System.out.println("Program Started");
        } else {
            System.out.println("Program Hatred");
        }       
    }
}