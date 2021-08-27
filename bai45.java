/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptit;

import java.util.Scanner;

/**
 *
 * @author Non Sleeping
 */
public class bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String nameClass = sc.nextLine();
        String date = sc.nextLine();
        float point = sc.nextFloat();
        Student student = new Student();
        student.setId("B20DCCN001");
        student.setName("Nguyen Van A");
        student.setNameClass(nameClass);
        student.setDate(date);
        student.setPoint(point);

        System.out.println(student.printf());

    }
}

class Student {
    private String id;
    private String name;
    private String nameClass;
    private String date;
    private float point;

    Student() {
        this.id = "";
        this.name = "";
        this.nameClass = "";
        this.date = "";
        this.point = 0f;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getDate() {
        String[] words = date.split("/");
        String s = "";
        while(words[0].length() < 2) {
            words[0] = '0' + words[0];
        }
        while(words[1].length() < 2) {
            words[1] = '0' + words[1];
        }
        while(words[2].length() < 4) {
            words[2] = '0' + words[2];
        }
        s = words[0] + "/" + words[1] + "/" + words[2];
        return s;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPoint() {
        String s = String.format("%.2f", point);
        return s;
    }

    public void setPoint(float point) {
        this.point = point;
    }
    
    public String printf() {
        return this.getId() + " " + this.getName() + " " +
                this.getNameClass() + " " + this.getDate() +
                " " + this.getPoint();
    }
}

