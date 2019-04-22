package tugaspenggantipbo;


public class Tentara extends Manusia {
    String Kota;
    void tempatDinas(){
        System.out.print("Tempat Dinas \t: ");
        Kota = input.next();
}
    @Override
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = input.next();
        System.out.print("Alamat \t:   ");
        Alamat = input.next();
        System.out.print("Temapt Tanggal Lahir \t:   ");
        tmpttgllhr = input.next();
    }
     protected void ciriPekerjaan(){
        System.out.print("\nPangkat :  ");
        pangkat = input.next();
   }
}
