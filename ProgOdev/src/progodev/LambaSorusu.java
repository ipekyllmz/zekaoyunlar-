/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progodev;


public class LambaSorusu {
    public int lamba1=0;
    public int lamba2=0;
    public int lamba3=0;
    public int oda=0;
    
    public void yakma () {
        
        if(lamba1==lamba2){
            System.out.println("Lamba1'i ve Lamba2'yi yak");
        }
        for(int i=0;i<=14;i++){
            
        }
        System.out.println("Lamba1 ve Lamba2 15 dk yandı ve Lamba1 kapatıldı");
        System.out.println("Lamba2 yanmaya devam ediyor");
        lamba1=15;
        
        for(int a=0; a<=4; a++){
            
    }
        System.out.println("Lamba2 20 dk yandı ve kapatıldı.");
        lamba2=20;
        if(oda==0){
             System.out.println("Odaya girildi");
        }
        oda=1;
        if(lamba2>lamba1) {
            System.out.println("Lamba2 daha sıcaktır ve son kullanılan anahtar ona aittir.");
        }
         if(lamba1<lamba2){
            System.out.println("Kullanılan anahtarlardan diğeri Lamba1'e aittir");
        }
        if(lamba3==0){
        System.out.println("Lamba3 hiç yakılmadı ve anahtarı hiç kullanılmadı");
        }
       
        
        System.out.println("Lamba1:"+lamba1+" Lamba2:"+lamba2+" Lamba3:"+lamba3);
       
         
        
      
    }
}
