package org.mossimo;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String address = "   www.GooGle.com  ";
        System.out.println(address.toLowerCase()); //makes new string into lower case

        address = address.trim(); //trims all space from beginning and end
        System.out.println(address);

        int dotIdx = address.indexOf('.'); //finds first dot
        int dotIdx2 = address.lastIndexOf('.'); //finds first dot from the end
        String company = address.substring(dotIdx + 1, dotIdx2); //variable holds everything between both dots

        System.out.println(dotIdx); //prints first dot
        System.out.println(dotIdx2); //prints first dot from the end

        System.out.println(company);




    /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age: ");
        String age = scanner.nextLine();

        System.out.println("You are " + age + " years old!");

     */
    }
}