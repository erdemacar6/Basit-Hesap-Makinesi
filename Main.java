import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        String islemler = "1.Toplama İşlemi\n"
                        + "2.Çıkarma İşlemi\n"
                        + "3.Çarpma İşlemi\n"
                        + "4.Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("***********************");
        System.out.println("İşlemi Seçiniz : ");
        String islem = scanner.nextLine();

        int a;
        int b;

        switch (islem){
            case "1":
                System.out.print("Birinci Sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı : ");
                b = scanner.nextInt();
                System.out.print("Girdiğiniz işlemlerin toplamı : " + (a + b));
                break;
            case "2":
                System.out.print("Birinci Sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı : ");
                b = scanner.nextInt();
                System.out.print("Girdiğiniz işlemlerin farkı : " + (a - b));
                break;
            case "3":
                System.out.print("Birinci İşlem : ");
                a = scanner.nextInt();
                System.out.print("İkinci İşlem : ");
                b = scanner.nextInt();
                System.out.print("Girdiğiniz işlemlerin çarpımı : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci İşlem : ");
                a = scanner.nextInt();
                System.out.print("İkinci İşlem : ");
                b = scanner.nextInt();
                System.out.print("Girdiğiniz işlemlerin bölümü : " + ((double) a / b));
                break;
            default:
                System.out.print("Geçersiz İşlem...");



        }

    }
}
//erdemacar6
