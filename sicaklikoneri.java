import java.util.Scanner;
public class sicaklikoneri {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        heat = input.nextInt();

        if(heat<5) {
            System.out.println("Kayak yapiniz!!");
        }
        else if (heat => 5 && heat <= 25) {
            if(heat<=15){
                System.out.println("sinemaya git");
        }
            if(heat>=10) {
                System.out.println("pikniğe git");
            }
    }else {
                System.out.println("yüzmeye git");
            }
    }
}
