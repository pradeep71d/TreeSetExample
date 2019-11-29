package com.example.treeset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TreeSet<String>tset=new TreeSet<>();//TreeSet Example for String
        tset.add("ABC");//treeSet maintains  Ascendidng order
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        tset.add("Jack");
        System.out.println("out is="+tset);
        TreeSet<Integer>tset2=new TreeSet<>();//TreeSet  example for Integer
        tset2.add(4);
        tset2.add(1);//Maintaining ascending order
        tset2.add(5);
        tset2.add(2);
        tset2.add(3);
        System.out.println("out is="+tset2);
    }
}
