
package progodev;


public class TekneSorusu {

    public int koyun=0;
    public int kurt=1;
    public int saman=2;

   public void tasima(){
   
       
       if(koyun!=saman && koyun!=kurt){
          
           System.out.println("Koyun doğuya taşındı");
           System.out.println("Tekne batıya döndü ve samanı alıp doğuya taşıyor");
           koyun=4;
       }
       if(saman!=kurt){
           System.out.println("Saman doğuya taşındı");
           saman=4;
           if(saman==koyun){
               System.out.println("Saman doğuya bırakıldı ve koyun alınıp batıya taşınıyor.");
               koyun=0;
           }
       }
       if(kurt!=koyun){
           System.out.println("Koyun batıya bırakıldı ve kurt alınıp doğuya taşınıyor");
           System.out.println("Kurt doğuya bırakıldı ve tekne batıya geri dönüyor");
           kurt=5;
           koyun=6;
           
       }
       if(koyun==6){
           System.out.println("Tekne batıya geri döndü ve koyun alınıp doğuya taşınıyor");
           System.out.println("Hepsi taşınmış oldu");
       }
       System.out.println("kurt :"+kurt+" koyun:"+koyun+" saman:"+saman);
       }
       
   }  
  

