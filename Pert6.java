package objek_dan_kelas;

public class Pert6 {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Hasil perhitungan dari Segitiga 1 dengan alas " + segitiga1.alas + ", tinggi "
                           + segitiga1.tinggi + ", dan sisi " + segitiga1.sisi + " adalah ");
        System.out.println("Luas        = " + segitiga1.getLuas());
        System.out.println("Keliling    = " + segitiga1.getKeliling());
        
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nHasil perhitungan dari Segitiga 2 dengan alas " + segitiga2.alas + ", tinggi "
                           + segitiga2.tinggi + ", dan sisi " + segitiga2.sisi + " adalah ");
        System.out.println("Luas        = " + segitiga2.getLuas());
        System.out.println("Keliling    = " + segitiga2.getKeliling());
        
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nHasil perhitungan dari Segitiga 3 dengan alas " + segitiga3.alas + ", tinggi "
                           + segitiga3.tinggi + ", dan sisi " + segitiga3.sisi + " adalah ");
        System.out.println("Luas        = " + segitiga3.getLuas());
        System.out.println("Keliling    = " + segitiga3.getKeliling());
    }
}

/*
package objek_dan_kelas;

import java.util.Scanner;

public class Pert6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai untuk Segitiga 1:");
        double alas1    = input.nextDouble();
        double tinggi1  = input.nextDouble();
        double sisi1    = input.nextDouble();
        Segitiga segitiga1 = new Segitiga(alas1, tinggi1, sisi1);
        
        System.out.println("\nMasukkan nilai untuk Segitiga 2:");
        double alas2    = input.nextDouble();
        double tinggi2  = input.nextDouble();
        double sisi2    = input.nextDouble();
        Segitiga segitiga2 = new Segitiga(alas2, tinggi2, sisi2);
        
        System.out.println("\nMasukkan nilai untuk Segitiga 3:");
        double alas3    = input.nextDouble();
        double tinggi3  = input.nextDouble();
        double sisi3    = input.nextDouble();
        Segitiga segitiga3 = new Segitiga(alas3, tinggi3, sisi3);
        
        System.out.println("\nHasil perhitungan dari Segitiga 1:");
        System.out.println("Luas        = " + segitiga1.getLuas());
        System.out.println("Keliling    = " + segitiga1.getKeliling());
        
        System.out.println("\nHasil perhitungan dari Segitiga 2:");
        System.out.println("Luas        = " + segitiga2.getLuas());
        System.out.println("Keliling    = " + segitiga2.getKeliling());
        
        System.out.println("\nHasil perhitungan dari Segitiga 3:");
        System.out.println("Luas        = " + segitiga3.getLuas());
        System.out.println("Keliling    = " + segitiga3.getKeliling());
    }
}
*/