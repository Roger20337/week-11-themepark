package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            int PeopleQ = 90;
            int time = 0;
            int newPeople = 63;
            int leavingPeople = 40;

            while (PeopleQ < 600) {
              PeopleQ -= leavingPeople;
              PeopleQ+=newPeople;
                time = time + 5;
            }
            System.out.println(time);



        }
    }
