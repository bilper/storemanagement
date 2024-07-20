import java.util.Arrays;
import java.util.*;




class Siparis {
    int siparisNo;
    int malNo;
    int miktar;
    double birimFiyat;

    Siparis(int siparisNo, int malNo, int miktar, double birimFiyat) {
        this.siparisNo = siparisNo;
        this.malNo = malNo;
        this.miktar = miktar;
        this.birimFiyat = birimFiyat;
    }

}




public class Main {
    public static void main(String[] args) {
        List<Siparis> siparisler = Arrays.asList(
                new Siparis(1000, 2000, 12, 100.51),
                new Siparis(1000, 2001, 31, 200),
                new Siparis(1000, 2002, 22, 150.86),
                new Siparis(1000, 2003, 41, 250),
                new Siparis(1000, 2004, 55, 244),
                new Siparis(1001, 2001, 88, 44.531),
                new Siparis(1001, 2002, 121, 88.11),
                new Siparis(1001, 2004, 74, 211),
                new Siparis(1001, 2002, 14, 88.11),
                new Siparis(1002, 2003, 2, 12.1),
                new Siparis(1002, 2004, 3, 22.3),
                new Siparis(1002, 2003, 8, 12.1),
                new Siparis(1002, 2002, 16, 94),
                new Siparis(1002, 2005, 9, 44.1),
                new Siparis(1002, 2006, 19, 90)
        );

        double toplamFiyat = siparisler.stream().mapToDouble(s -> s.birimFiyat).sum();
        double ortalamaFiyat = toplamFiyat / siparisler.size();
        System.out.println("Üç siparişteki bütün malların ortalama fiyatı: " + ortalamaFiyat);
    }
}
