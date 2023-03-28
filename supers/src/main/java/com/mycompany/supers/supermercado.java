/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supers;

/**
 *
 * @author Aron
 */



public class Supermercado {
    private int code;
    private String name;
    private String gname;
    private double totalsales;
    private double msales;
    private double tsales;
    private double wsales;
    private double thsales;
    private double fsales;
    private double sasale;
    private double sunsales;

    public Supermercado(int code, String name, String gname, double totalsales, double msales, double tsales, double wsales, double thsales, double fsales, double sasale, double sunsales) {
        this.code = code;
        this.name = name;
        this.gname = gname;
        this.totalsales = totalsales;
        this.msales = msales;
        this.tsales = tsales;
        this.wsales = wsales;
        this.thsales = thsales;
        this.fsales = fsales;
        this.sasale = sasale;
        this.sunsales = sunsales;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "code=" + code + ", name=" + name + ", gname=" + gname + ", totalsales=" + totalsales + ", msales=" + msales + ", tsales=" + tsales + ", wsales=" + wsales + ", thsales=" + thsales + ", fsales=" + fsales + ", sasale=" + sasale + ", sunsales=" + sunsales + '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getMsales() {
        return msales;
    }

    public void setMsales(double msales) {
        this.msales = msales;
    }

    public double getTsales() {
        return tsales;
    }

    public void setTsales(double tsales) {
        this.tsales = tsales;
    }

    public double getWsales() {
        return wsales;
    }

    public void setWsales(double wsales) {
        this.wsales = wsales;
    }

    public double getThsales() {
        return thsales;
    }

    public void setThsales(double thsales) {
        this.thsales = thsales;
    }

    public double getFsales() {
        return fsales;
    }

    public void setFsales(double fsales) {
        this.fsales = fsales;
    }

    public double getSasale() {
        return sasale;
    }

    public void setSasale(double sasale) {
        this.sasale = sasale;
    }

    public double getSunsales() {
        return sunsales;
    }

    public void setSunsales(double sunsales) {
        this.sunsales = sunsales;
    }

    public double totalweeksales() {
        this.totalsales = (this.msales + this.tsales + this.wsales + this.thsales + this.fsales + this.sasale + this.sunsales);
                return this.totalsales;
        }
    public double pmonday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.msales / a);
        return per1;
    }
    public double ptuesday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.tsales / a);
        return per1;
    }
    
    public double pwednesday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.tsales / a);
        return per1;
    }
    
    public double pthursday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.thsales / a);
        return per1;
    }
    public double pfriday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.fsales / a);
        return per1;
    }
    public double psaturday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.sasale / a);
        return per1;
        
    }
    
    public double psunday(){
        double a;
        double per1;
        a = (this.totalsales/100);
        per1 = (this.sunsales / a);
        return per1;
    }
}
