
package progodev;


public class DefineSorusu {
    double BirinciKisi;
    double İkinciKisi;
    double ÜcüncüKisi;
    double ToplamDefine;
    public void hesapla(){
        
       
       BirinciKisi=((ToplamDefine+6)/7);
       İkinciKisi=(2+((6*ToplamDefine+78)/49));
       ÜcüncüKisi=(3+((36*ToplamDefine+762)/343));
        
       
       BirinciKisi=İkinciKisi;
       ÜcüncüKisi=BirinciKisi;
       İkinciKisi=ÜcüncüKisi;
       
       ToplamDefine=BirinciKisi+İkinciKisi+ÜcüncüKisi;
      
       
        
        System.out.println("Birinci kişi "+(BirinciKisi)+" milyon tl");
        System.out.println("İkinci kişi "+(İkinciKisi)+" milyon tl");
        System.out.println("Üçüncü kişi "+(ÜcüncüKisi)+" milyon tl");
        System.out.println("Toplam para miktarı : "+(ToplamDefine));
        
      
    }
}
