/*
Örnek Çıktı:

oguz dizide bulundu
metin dizide bulunamadı

*/

package JavaİleALgoritmalar;


/**
 *
 * @author Mehmet Emin Ural 
 */
public class DizideİsimArama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String isimler[] = {"ali", "mehmet", "oguz", "ramazan","sevval","rotinda"};
        
        String kelime = "oguz";
        if (ara(isimler, kelime)) {
            System.out.println(kelime + " dizide bulundu");
        } else {
            System.out.println(kelime + " dizide bulunamadı");
        }

        kelime = "metin";
        if (ara(isimler, kelime)) {
            System.out.println(kelime + " dizide bulundu");
        } else {
            System.out.println(kelime + " dizide bulunamadı");
        }

    }

    public static boolean ara(String dizi[], String aranan) {

        for (int i = 0; i < dizi.length; i++) {
            if (aranan.equals(dizi[i])) {
                return true;
            }
        }
        return false;

    }
}
