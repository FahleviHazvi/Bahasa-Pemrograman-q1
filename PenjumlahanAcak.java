# Bahasa-Pemrograman-q1
import java.util.Scanner;
public class PenjumlahanAcak
{
  public static void main(String [] dhani)
  {
    int point = 0;
    int hitung = 0;
    String keluaran = "";
    Scanner br = new Scanner(System.in);
    System.out.print( "Masukkan jumlah soal yang diinginkan\t:");
    int JUMLAH_PERTANYAAN = br.nextInt();
    while (hitung < JUMLAH_PERTANYAAN)
    {
      int angka1a = (int)(Math.random() * 20);
      int angka2a = (int)(Math.random() * 20);
      System.out.println();
      System.out.println("============================");
      System.out.println();
      System.out.print( "Berapakah hasil dari " + angka1a + " + " + angka2a + "? ");
      int jawab = br.nextInt();
      if (angka1a + angka2a == jawab)
      {
        point++;
        System.out.println("Jawaban Anda Benar.");
      }
      else
        System.out.println("Jawaban Anda salah.\n" + angka1a + " + " + angka2a + " seharusnya " + (angka1a + angka2a));
      hitung++;
      keluaran += "\n" + angka1a + "+" + angka2a + "=" + jawab +
        ((angka1a - angka2a == jawab) ? " benar" : " salah");
    }
    System.out.println();
    System.out.println("============================");
    System.out.println("Total point yang anda peroleh adalah " + (point*10) );
    System.out.println("Dengan jawaban yang benar adalah " + point );
  }
}
