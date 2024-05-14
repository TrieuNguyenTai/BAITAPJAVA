package btchuong4.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import btchuong3.Person;

public class ArrayListDemo {
    ArrayList<Student> arrListStudent = new ArrayList<Student>();
    for(int i=0;i<5;i++){
        Student st = new Student();
        st.NhapThongTin();
        arrListStudent.add(st);
    }
    for(int i = 0; i < arrListStudent.size(); i++){
        arrListStudent.get(i).InThongTin();
    }
}