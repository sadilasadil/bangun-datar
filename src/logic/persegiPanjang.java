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
public class persegiPanjang {
    private double panjang;
    private double lebar;
 
    public void setPanjang(double p){
        panjang = p;
    }
    public void setLebar(double l){
        lebar = l;
    }
 
    public double getPanjang(){
        return panjang;
    }
 
    public double getLebar(){
        return lebar;
    }
 
    public double hitungLuas(){
        double luas = 0;
        luas = panjang*lebar;
        return luas;
    }
 
    public double hitungKeliling(){
        double keliling = 0;
        keliling = (2*panjang)+(2*lebar);
        return keliling;
    }
}
