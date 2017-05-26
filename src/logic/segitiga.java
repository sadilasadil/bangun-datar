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
public class segitiga {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
 
    public void setAlas(double a){
        this.alas = a;
    }
 
    public void setTinggi(double t){
        this.tinggi = t;
    }
 
    public void setSisi1(double s1){
        this.sisi1 = s1;
    }
 
    public void setSisi2(double s2){
        this.sisi2 = s2;
    } 
 
    public void setSisi3(double s3){
        this.sisi3 = s3;
    }
 
    public double getAlas(){
        return alas;
    }
 
    public double getTinggi(){
        return tinggi;
    }
 
    public double hitungLuas(){
        double luas = 0;
        luas = 0.5*alas*tinggi;
        return luas;
    }
 
    public double hitungKeliling(){
        double keliling = 0;
        keliling = sisi1+sisi2+sisi3;
        return keliling;
    }
}
