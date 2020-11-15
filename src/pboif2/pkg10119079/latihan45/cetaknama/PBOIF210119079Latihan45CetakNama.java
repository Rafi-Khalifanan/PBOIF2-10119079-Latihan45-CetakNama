package pboif2.pkg10119079.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan45CetakNama {
    public static void main(String[] args) {
        Printer print = new Printer();        
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukan nama anda: ");
        print.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak (input.nextInt());

        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}    
