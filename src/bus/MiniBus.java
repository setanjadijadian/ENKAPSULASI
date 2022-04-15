/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author ASUSVivoBook
 */
public class MiniBus {
    /*
    //====================ClassBUS================
    //Latihan 1
        public int penumpang,maxpenumpang;
    
    
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);

    //Latihan 2
        private int penumpang,maxpenumpang;
    
    // konstruktor
    public MiniBus (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);

    //================Encapsulasi==================
    //Latihan 3
    private String name;
    private String address;
    private int age;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public void setName (String newName){
        name=newName;
    }
    public void setAddress (String newAddress){
        address=newAddress;

    //====================ClassBUS================
        //Latihan4
    private int penumpang,maxpenumpang;
    
    // konstruktor
    public MiniBus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
*/
        //====================ClassBUS================
        //Soal Praktikum
     private double jari, phi, D, LP, V;

    public MiniBus(){
        phi = 3.14;
        jari = 0;
        D = 0;
        LP = 0;
        V = 0;
    }

    public void setJari(double inputr){
        double temp;
        temp=this.jari+inputr;
        this.jari = temp;
        System.out.println("Jari-jari : " + jari);
    }

    public void showD(){
        D = 2*jari;
        System.out.println("Diameter : " + D);
    }

    public void showLP(){
        LP = 4*phi*Math.pow(jari,2);
        System.out.println("Luas Permukaan Bola.Bola : " + LP);
    }

    public void showV(){
        V = (4*phi*Math.pow(jari,3))/3;
        System.out.println("Volume Bola.Bola : " + V);
    }
}
