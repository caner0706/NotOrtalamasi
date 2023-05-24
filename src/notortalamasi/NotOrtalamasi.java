package notortalamasi;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Matematik Notunuzu Girin : ");
        double matematikNot = scanner.nextDouble();
        
        System.out.print("Lütfen Fizik Notunuzu Girin : ");
        double fizikNot = scanner.nextDouble();
        
        System.out.print("Lütfen Kimya Notunuzu Girin : ");
        double kimyaNot = scanner.nextDouble();
        
        System.out.print("Lütfen Türkçe Notunuzu Girin : ");
        double turkceNot = scanner.nextDouble();

        System.out.print("Lütfen Tarih Notunuzu Girin : ");
        double tarihNot = scanner.nextDouble();
        
        System.out.print("Lütfen Müzik Notunuzu Girin : ");
        double muzikNot = scanner.nextDouble();
        
        
        double ortalama =  (matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot) / 6 ;
        System.out.println("Ortalama : " + ortalama); 
        
        // ternary operator --> Kısa Durum Değerlendirme
        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
 
    }
    
}
