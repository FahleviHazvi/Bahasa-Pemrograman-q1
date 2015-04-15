# Bahasa-Pemrograman-q1
import java.util.Scanner;

public class AplikasiHitung{
 public static void main (String args []){
  
  Scanner input = new Scanner(System.in);
  int hargaKaos = 25000;
  int jmlhKaos = 40;
  int jmlhBeli, jmlhBonus, total, totKaos, sisa, bayar, kembali;
  
  System.out.println("=============================");
  System.out.println(" ||    Aplikasi Hitung    || ");
  System.out.println(" ||  Promo Beli 2 Dapat 1 || ");
  System.out.println("=============================");
  
  //input
  System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
  System.out.print("Masukan jumlah kaos yang dibeli : ");
  jmlhBeli = input.nextInt();
  System.out.println("Harga Kaos @25000");
  System.out.println("================================");
  
  //proces
  jmlhBonus = jmlhBeli/2;
  totKaos = jmlhBeli+jmlhBonus;
  total = jmlhBeli*hargaKaos;
  sisa = jmlhKaos-jmlhBeli-jmlhBonus;
  
  //output
  System.out.println("Jumlah kaos yang dibeli : "+jmlhBeli);
  System.out.println("Bonus kaos yang didapatkan : "+jmlhBonus);
  System.out.println("Total kaos : "+totKaos);
  System.out.println("Harga bayar : "+total);
  System.out.println("Sisa stock kaos : "+sisa);
  
  //input
  System.out.println("=============================");
  System.out.print("Pembayaran : ");
  bayar = input.nextInt();
  kembali = bayar-total;
  System.out.print("Kembalian : "+kembali);
  System.out.println(""); 
  System.out.println("       Created By Coey       ");
  System.out.println("=============================");
 }
}
