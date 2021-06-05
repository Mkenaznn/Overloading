package Overloading;

public class Over {
       public void kurang(int a, int b) {
              System.out.println("Pengurangan 2 angka = "+ (a-b));
       }
       public void kurang(int a, int b, int c) {
              System.out.println("Pengurangan 3 angka = "+ (a-b-c));
       }
       public void kurang(float a, int b) {
              System.out.println("Pengurangan angka tipe data float dengan integer "+ (a-b));
       }
       public void kurang(int a, float b) {
              System.out.println("Pengurangan angka tipe data interger dengan float "+ (a-b));
       }

}

