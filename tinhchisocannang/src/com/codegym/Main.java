package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    BodyIndex body = new BodyIndex();
	    body.getData();
	    body.getResult();
    }
}
class BodyIndex {
   private float weight, height, bmi;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cua ban");
        System.out.print("nhap can nang: ");
        weight = scanner.nextFloat();
        System.out.println("nhap chieu cao: ");
        height = scanner.nextFloat();
    }
    public void getResult(){
        bmi = weight / (height * height);
        if( bmi < 18.5 ){
            System.out.println("ban co chi so bmi la: "+bmi+" ban dang trong trang thai Underweight");
        }else if(bmi < 25){
            System.out.println("ban co chi so bmi la: "+bmi+" ban dang trong trang thai Normal");
        }else if(bmi < 30){
            System.out.println("ban co chi so bmi la: "+bmi+" ban dang trong trang thai Overweight");
        }else{
            System.out.println("ban co chi so bmi la: "+bmi+" ban dang trong trang thai Obese");
        }

        }
}