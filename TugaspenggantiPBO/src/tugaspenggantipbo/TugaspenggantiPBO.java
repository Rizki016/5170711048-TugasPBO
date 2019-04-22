package tugaspenggantipbo;
import java.util.Scanner;

public class TugaspenggantiPBO {

  
  
    public static void main(String[] args) {
       
     Scanner input = new Scanner(System.in);
     String pekerjaan;
        
      Polisi RI = new Polisi();
      Tentara indo = new Tentara();
      
        System.out.println("Masukkan Pekerjaan : ");
        pekerjaan = input.next();
        switch (pekerjaan){
            case "polisi" :
            RI.identitas();
            RI.ciriPekerjaan();
            RI.tempatDinas();    
      break;
            case "tentara":
            indo.identitas();
            indo.ciriPekerjaan();
            indo.tempatDinas();
      break;
            default:
                System.out.println("Pekerjaan Yang Anda Masukkan Salah ! !");
        }
    }
    
}
