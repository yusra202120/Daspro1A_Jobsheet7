import java.util.Scanner;

public class WhileGaji29 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    
    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur = 0, totalGajiLembur = 0;
    String jabatan;

    System.out.println("Masukkan jumlah karyawan");
    jumlahKaryawan = scan.nextInt();
    

    int i = 0;
    while (i < jumlahKaryawan){
        System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ":");
        jabatan = scan.next();
        System.out.print("Masukkan jumlah jam lembur : ");
        jumlahJamLembur = scan.nextInt();
        

        if (jabatan.equalsIgnoreCase("direktur")){
            continue;
        }else if (jabatan.equalsIgnoreCase("manager")){
            gajiLembur = jumlahJamLembur*1000000;
            System.out.println("Gaji Lembur : "+ gajiLembur);
        }else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = jumlahJamLembur * 75000;
            System.out.println("Gaji Lembur : "+ gajiLembur);
        }else {
            System.out.println("Jabatan Invalid");
        }
        totalGajiLembur += gajiLembur;
        i++;
    }
    System.out.println("Total gaji lembur : " + totalGajiLembur);


    }
}
