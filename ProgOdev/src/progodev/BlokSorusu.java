
package progodev;


public class BlokSorusu {
   public String mavi="mavi";
   public String mor="mor";
   public String yesil="yesil";
   public String sari="sari";
   public String kirmizi="kirmizi";

    public void siralama() {
        String dizi1[]={mor,mavi,yesil,sari,kirmizi};
        System.out.println("1. çubuğun üstten alta doğru sıralanışı :");
        for(int a=0;a<dizi1.length;a++){
         
            System.out.println(dizi1[a]);
        }
         System.out.println("2. çubuğun üstten alta doğru sıralanışı");
        for(int b=dizi1.length-1;b>=0;b--){
             
              System.out.println(dizi1[b]);
        }
         System.out.println("3. çubuğun üstten alta doğru sıralanışı: ");
        for(int c=0;c<dizi1.length;c++){
          
            System.out.println(dizi1[c]);
        }
    }

           
    
}
