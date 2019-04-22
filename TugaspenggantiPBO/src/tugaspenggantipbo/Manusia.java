package tugaspenggantipbo;

import java.util.Scanner;

public class Manusia {
     Scanner input = new Scanner(System.in);
    String nama, Alamat, tmpttgllhr,pekerjaan,pangkat;
    void identitas(){
        System.out.print("Nama \t:   ");
        nama = input.next();
        System.out.print("Alamat \t:   ");
        Alamat = input.next();
        System.out.print("Temapt Tanggal Lahir \t:   ");
        tmpttgllhr = input.next();
    }
    protected void ciriPekerjaan(){
        System.out.print(" Pekerjaan \t : ");
        pekerjaan = input.next();
        System.out.print("Pangkat  :  ");
        pangkat = input.next();
    }
}
