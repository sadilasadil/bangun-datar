/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Salsadila
 */
public class lingkaran {
    private double jari;
 
    public void setJari(double j){
        jari = j;
    }
 
    public double getJari(){
        return jari;
    }
 
    public double hitungLuas(){
        double luas=0;
        luas = Math.PI * Math.pow(jari, 2);
        return luas;
    }
 
    public double hitungKeliling(){
        double keliling=0;
        keliling = 2 * Math.PI * jari;
        return keliling;
    }
}
