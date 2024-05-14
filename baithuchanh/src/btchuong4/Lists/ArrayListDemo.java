package btchuong4.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import btchuong3.Person;

public class ArrayListDemo {
    ArrayList<Student> arrayListStudents = new ArrayList<Student>();
    for( int i = 0; i< 3; i++){
        Student st = new Student();
        st.NhapThongTin();
        arrayListStudents.add(st);
    }
    for(int i = 0; i < arrayListStudents.size();i++){
        
    }

    
}
