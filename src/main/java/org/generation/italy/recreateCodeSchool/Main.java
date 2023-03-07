package org.generation.italy.recreateCodeSchool;

import org.generation.italy.recreateCodeSchool.model.entities.Course;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args){

    int[] babboNatale = new int[20];

    for(int i=0; i<20; i++){

      babboNatale [i] = i + 1;

    }
    for (int i=0; i<4 ; i++) {

      for (int k=0; k<5 ; k++) {
        System.out.print(" " + babboNatale[k+(5*i)]);
      }
      System.out.println();
    }

    Course omar = new Course();
    Course ciccio = new Course(1,"ciccio", "ksdajbas","sjhvb", 2932, LocalDate.of(2022,12,25));


    System.out.println(ciccio);
    System.out.println(omar);




//    for (int i=0; i<5 ; i++) {
//
//      System.out.print(babboNatale[i]);
//
//
//    }
//    System.out.println();
//    for (int i=5; i<10 ; i++) {
//
//      System.out.print( babboNatale[i]);
//
//    }
//    System.out.println();
//    for (int i=10; i<15 ; i++) {
//
//      System.out.print( babboNatale[i]);
//
//    }
//    System.out.println();
//    for (int i=15; i<20 ; i++) {
//
//      System.out.print( babboNatale[i]);
//
//    }

  }

}
