import java.util.Scanner;

public class UcapanTerimaKasih_22 {
   public static String PenerimaUcapan(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan:");
       String namaOrang = sc.nextLine();
       sc.close();
       return namaOrang;
   } 
   public static void UcapanTambahan(String tambahan){
       System.out.println(tambahan);
   }
   public static void UcapanTerimaKasih(){
       String nama = PenerimaUcapan();
       System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
       "You inspired in me a love for learning and made me feel Like I could ask you anything.");
       UcapanTambahan("I am truly grateful for your support and encouragement.");
   }
   public static void main(String[] args) {
       UcapanTerimaKasih();
   }
}