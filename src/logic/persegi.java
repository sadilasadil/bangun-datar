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
public class persegi {
    private double sisi;
 
    public void setSisi(double s){
        sisi = s;
    }
 
    public double getSisi(){
        return sisi;
    }
 
    public double hitungLuas(){
        double luas = 0;
        luas = sisi*sisi;
        return luas;
    }
 
    public double hitungKeliling(){
        double keliling = 0;
        keliling = 4*sisi;
        return keliling;
    }
}
