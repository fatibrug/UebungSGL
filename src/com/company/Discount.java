package com.company;

public class Discount {
    public static void main(String[] args) {

        // bus discount if you are a senior, a dog or a student

        boolean senior = true;
                boolean dog = true;
                        boolean student = true;

                        // book discount if you buy more than 2 non-fiction and at least one fiction book

                        int nonfiction = 2;

                        int fiction = 1;


                        //grocery shop if you buy one drink but only if it is not alcoholic

         int nonalcoholic = 1;

        System.out.println("discount: " +(student || dog || senior));
        System.out.println("book disc. " +(nonfiction >= 2 && fiction >= 1));
        System.out.println("grocery " +(nonalcoholic >= 1));
    }
}
