package pboif2.pkg10119079.latihan45.cetaknama;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){

        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){

        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        
        
    }
    
    public void cetak(int jmlCetak, String nama){

        System.out.println("Hasil Cetak: ");
        for (int i = 1 ;i <= jmlCetak; i++){
            System.out.println(i +"." + nama);
        }
    }
}
