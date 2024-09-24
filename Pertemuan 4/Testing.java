import java.util.Scanner;

public class Testing
{
   public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("------------------------");
        System.out.println("Kalkulator");
        System.out.println("------------------------");
        System.out.println("Masukkan angka pertama: ");
        double num1 = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double num2 = input.nextDouble();

        System.out.println("------Jenis Operasi------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Pilih Operasi: ");
        int pilih = input.nextInt();
        System.out.println("-----------Hasil----------");
            
        switch (pilih) {
            case 1:
                System.out.println("Hasil dari: " + num1 + " + " + num2 + " = " + kalkulator.tambah(num1,num2));
                break;
            case 2:
                System.out.println("Hasil dari: " + num1 + " - " + num2 + " = " + kalkulator.kurang(num1,num2));
                break;
            case 3:
                System.out.println("Hasil dari: " + num1 + " * " + num2 + " = " + kalkulator.kali(num1,num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Hasil dari: " + num1 + " / " + num2 + " = " + kalkulator.bagi(num1,num2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak valid.");
                }                
                break;
            default:
                System.out.println("Operasi tidak valid");
                break;
       }
       input.close();
       System.out.println("--------Terima Kasih-------");
   }
}
