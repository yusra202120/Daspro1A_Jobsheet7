import java.util.Scanner;

public class ModifikasiFortoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, total =0, counter=0, average;

        System.out.println("Masukkan bilangan kelipatan (1-9)");
        kelipatan= scan.nextInt();

        int i = 1;
        while(i <=50){

        if(i % kelipatan==0){
            total += i;
            counter++;
        }
        i++;
    }

        average = total / counter;

        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata dari seluruh bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, average);
    }

    
}
