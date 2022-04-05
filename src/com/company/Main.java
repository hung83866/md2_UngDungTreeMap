package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student hv1 = new Student(1,new Language("java"),"Đặng Anh Tây");
        Student hv2 = new Student(2,new Language("PHP"),"Đặng Anh Tây");
        Student hv3 = new Student(3,new Language("C"),"Đặng Anh Tây");
        Student hv4 = new Student(4,new Language("java"),"Đặng Anh Tây");
        Map<Integer,Student> map = new HashMap<>();
        map.put(hv1.getId(),hv1);
        map.put(hv2.getId(),hv2);
        map.put(hv3.getId(),hv3);
        map.put(hv4.getId(),hv4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ID");
        int ID = scanner.nextInt();
        System.out.println(map.get(ID));;
    }
}
