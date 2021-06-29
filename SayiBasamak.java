
/* 
Örnek Kod
Bir sayi gir
4
bir(3)+iki(3)+üç(2)+dört(4)+=12  

*/
import java.util.Scanner;


public class SayiBasamak {
    
  // Mehmet Emin Ural 04/09/2020
    public static void main(String[] args) {
 
        
      Scanner oku =new Scanner (System.in);
      System.out.println("Bir sayi gir");
      int sayix=oku.nextInt();
     
      int sayi=sayix;
      int topla = 0;
      int basamak=1;
     
     
      while(sayi>=10){
          sayi=sayi/10;
          basamak++;
      }
      
      String birler[]={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
      String onlar []={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
      String yüzler[]={"","yüz","ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz"};
      
      
      switch (basamak){
    
       case 1 : for(int i=1;i<=sayix;i++){
          
           System.out.print(birler[i]+"("+ birler[i].length()+")+");
            topla=topla+birler[i].length();
        }
           System.out.println("="+topla); break;
           
       case 2:for(int i=1;i<=sayix;i++){
          
         
           System.out.print(onlar[i/10]+birler[i%10]+"("+(onlar[i/10]+birler[i%10]).length()+")+");
           topla=topla+(onlar[i/10]+birler[i%10]).length();  
           }
          System.out.println("="+topla); break;
          
       case 3: for(int i=1;i<=sayix;i++){
      
           System.out.print(yüzler[i/100]+onlar[(i/10)%10]+birler[i%10]+"("+(yüzler[i/100].length()+onlar[(i/10)%10]+birler[i%10]).length()+")+");
           topla=topla+(yüzler[i/100]+onlar[(i/10)%10]+birler[i%10]).length();  
          
           }
          System.out.println("="+topla); break;
  

    }
    }
}
