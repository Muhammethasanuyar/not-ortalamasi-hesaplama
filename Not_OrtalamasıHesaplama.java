import java.util.Scanner;

public class Not_OrtalamasıHesaplama {
    public static void main(String[] args) {
        int vizeNotu;
        int FinalNotu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("vize notunu giriniz : ");
        vizeNotu = scanner.nextInt();
        System.out.print("final notunu giriniz : ");
        FinalNotu = scanner.nextInt();
        System.out.print("NOT ORTALAMANIZ : ");
        System.out.println((vizeNotu * 0.4) + (FinalNotu * 0.6));

        if ((vizeNotu * 0.4) + (FinalNotu * 0.6) < 50) {
            System.out.println("KALDINIZ!");
        } else {
            System.out.println("GEÇTİNİZ!");
        }

    }

}
