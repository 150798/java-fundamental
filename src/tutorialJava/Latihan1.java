package tutorialJava;

public class Latihan1 {
	public static void main(String[] args) {
		//kalau mau bikin jumlah barus sama bintangnya sama
//		for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("*");
//            }System.out.println("");
//        }
		
		
//		int a,b,c,d;
//        for (a = 1; a <=9; a++) {
//            //outerloop
//            for ( b = 8; b >= a; b--) {
//                //inner loop no 1
//                System.out.print(" ");
//                //Untuk memberikan spasi ke samping
//            }
//            
//            for ( c = 1; c <=a; c++) {
//                //inner loop no 2
//                System.out.print("*");
//                //menampilkan bintang dari kanan ke kiri
//            }
//            for ( d = 1; d <= a-1; d++) {
//                //inner loop no 3
//                System.out.print("*");  
//                //menampilkan bintang dari kiri ke kanan
//            }
//            System.out.println();
//            //Memberikan baris baru atau enter pada 
//        }
		
		int a = 5;
	       for (int b = 1; b <= a; b++){
	           for (int c = 4; c >= b; c--) {
	               System.out.print(' ');
	           }
	           for (int d = 1; d <= b; d++){
	               System.out.print('*');
	           }
	           System.out.println();
	       }
		
		
		
		
		
	}

}
