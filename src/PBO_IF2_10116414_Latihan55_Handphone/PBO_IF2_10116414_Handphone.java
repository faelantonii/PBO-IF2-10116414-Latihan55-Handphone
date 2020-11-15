/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan55_Handphone;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan handphone
 */
public class PBO_IF2_10116414_Handphone {
    public static void main(String[] args) {
        Android android = new Android("Samsung","Android","Grand",3000000);
        Blackberry blackberry = new Blackberry("BlackB","RIM","Curve",2000000);
        WindowsPhone windowsphone = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        
        
        blackberry.setPinBB("BHS249");
        blackberry.displayProduct();
        System.out.println("PIN : "+blackberry.getPinBB());
        System.out.println("");
        
       
        windowsphone.setWpKeyStore("UUUQIJWORJ");
        windowsphone.displayProduct();
        System.out.println("Wp Key Store : "+windowsphone.getWpKeyStore()); 
      
    }
}
