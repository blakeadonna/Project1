package com.nguyen.Project1;
import java.util.*;
//Johnny Nguyen | 07/02/19 | Program that manipulates information provided to it


public class Main {

    public static void main(String[] args) {
        //Sets menu variable to 0
        int menu = 0;

        ArrayList<String> tasks = new ArrayList<>();

        while(menu != 5) {
            System.out.println("Please choose an option:");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(5) Exit.");

            //Enter a number which is associated with each above value
            Scanner input = new Scanner(System.in);
            menu = input.nextInt();

            //adds something
            if (menu == 1) {
                System.out.println("What would you like to add?");
                Scanner add = new Scanner(System.in);
                String add2 = add.nextLine();
                tasks.add(add2);
            }

            //removes something
            if (menu == 2) {
                System.out.println("Which task would you like to remove?");
                Scanner rem = new Scanner(System.in);
                int rem2 = rem.nextInt();
                tasks.remove(rem2);
            }

            //updates something
            if (menu == 3){
                System.out.println("Which task do you want to update?");
                Scanner upd = new Scanner(System.in);
                int upd2 = upd.nextInt();
                Scanner upd3 = new Scanner(System.in);
                tasks.set(upd2, upd3.nextLine());

            }

            //prints everything
            if (menu == 4){
                System.out.println(tasks);
            }

            //leaves
            if (menu == 5){
                System.out.println("Have a nice day~");
                System.exit(0);
            }


        }
    }
}
