package com.example.admin.firstdatatest;
import java.util.ArrayList;
/**
 * Created by Admin on 8/1/2017.
 */

public class CodingTest
{
    public static void main(String[]args)
    {
        int Object1= 15;
        int Object2 = 2;
        int Object3= 3;
        int Total = 15/3;


        int[] numbers = new int[]{1, 2 , 3 ,
        4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15};

        if(Total == 5)
        {
            System.out.println("Buzz");
        }
        else if(Total ==3)
            System.out.println("Fizz");
        else
        {
            System.out.println("BuzzFizz");
        }

        if (numbers.equals(5))
        {
            System.out.println("Buzz");
        }



        ArrayList<String> StringArrayList = new ArrayList<>();
        StringArrayList.add("A");
        StringArrayList.add("B");
        StringArrayList.add("A");
        StringArrayList.add("C");
        StringArrayList.add("D");
        StringArrayList.add("B");
        StringArrayList.add("E");
        System.out.println("The Letter A");
        System.out.println(StringArrayList.get(0)+ " " + StringArrayList.get(2));
        System.out.println("The Letter B");
        System.out.println(StringArrayList.get(1) + " " + StringArrayList.get(5));

    }

    public void printFizzBuss(ArrayList<Integer> numbers)
    {

    }
}
