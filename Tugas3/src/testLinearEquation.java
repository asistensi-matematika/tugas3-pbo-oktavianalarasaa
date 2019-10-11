/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author oktaviana larasati
 */
public class testLinearEquation {
    public static void main(String[]args){
    Scanner nilai = new Scanner(System.in);
    LinearEquation nilaimasuk = new LinearEquation();
        System.out.println("Input \t : ");
        double a = nilai.nextDouble();
        nilaimasuk.setA(a);
        double b = nilai.nextDouble();
        nilaimasuk.setB(b);
        double c  = nilai.nextDouble();
        nilaimasuk.setC(c);
        double d = nilai.nextDouble();
        nilaimasuk.setD(d);
        double e = nilai.nextDouble();
        nilaimasuk.setE(e);
        double f = nilai.nextDouble();
        nilaimasuk.setF(f);
        nilaimasuk.cekSolusi();
        
        
    
}
}
