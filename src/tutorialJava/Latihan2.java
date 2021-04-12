package tutorialJava;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        
        String nama;
        System.out.print("Nama :");
        nama = input.next();
        
        System.out.print("Pilihan:\n 1. Person\n 2. Pendidikan\n 3.Keluar\n");
        
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        
        

        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 15.000");

            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Mie Ayam");
                System.out.println("Harga : 10.000");

            break;
           
            default:
            System.out.println("Menu tidak tersedia ! :(");
        }
    }
}
