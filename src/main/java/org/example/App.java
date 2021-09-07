package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nHow many euros are you exchanging? ");
        Scanner euroAmountInput = new Scanner(System.in); //scan for the amount of euros being exchanged
        double euroAmount = euroAmountInput.nextDouble();

        System.out.println("\nWhat is the exchange rate? ");
        Scanner exchangeRateInput = new Scanner(System.in); //scan for the exchange rate
        double exchangeRate = exchangeRateInput.nextDouble();

        double dollarsAmount = euroAmount * exchangeRate; //calculate the amount of U.S. dollars that can come from the euros with the current exchange rate

        //tell user how many U.S. dollars can come from the euros with the current exchange rate
        System.out.println("\n" + (int)euroAmount + " euros at an exchange rate of " + exchangeRate + " is\n" + String.format("%.2f", dollarsAmount) + " U.S. dollars."); //format the dollarsAmount to always be with 2 values after the decimal to represent U.S. dollars
    }
}
