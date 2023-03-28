/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supers;

import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Aron
 */
public class Comp {
    private double max;
    private double min;
    private double s1;
    private double s2;
    private double s3;

    public Comp(double s1, double s2, double s3, double max, double min) {
        this.max = max;
        this.min = min;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }
//212573523
    public void setMin(double min) {
        this.min = min;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }
    
    public void maximo() {
     ArrayList<Double> arraylist = new ArrayList<>();
     arraylist.add(this.s1);
     arraylist.add(this.s2);
     arraylist.add(this.s3);
     
     this.max = Collections.max(arraylist);
     this.min = Collections.min(arraylist);
    
    }
    
}
