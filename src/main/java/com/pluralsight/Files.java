package com.pluralsight;

import java.util.Scanner;

public class Files {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continuePrompt = true;
        while(continuePrompt)
        {
            try
            {
                String[] quotes =
                        {
                        "The only way to do great work is to love what you do. - Steve Jobs",
                        "Life is what happens when you're busy making other plans. - John Lennon",
                        "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln",
                        "You miss 100% of the shots you don't take. - Wayne Gretzky",
                        "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
                        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                        "Believe you can and you're halfway there. - Theodore Roosevelt",
                        "Strive not to be a success, but rather to be of value. - Albert Einstein",
                        "Life is either a daring adventure or nothing at all. - Helen Keller",
                        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill"
                };

                System.out.print("Pick a number (select #1 - #10): ");
                int index = scanner.nextInt();
                index--;

                System.out.println(quotes[index]);
            }
            catch (Exception e)
            {
                System.out.println("Your number was out of range!");
            }
            System.out.println("Do you want to see another quote? (yes/no):");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes"))
            {
                continuePrompt = false;
            }
        }
    }
}
