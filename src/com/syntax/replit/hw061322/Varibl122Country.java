package com.syntax.replit.hw061322;

public class Varibl122Country {

    /*
    Declare 3 instance variables to hold:
    - name of the country
    - capital
    - population size
    Create a method to display values of
    instance variables. Create 2 Objects,
    assign values to instance variables,
    execute method display:
    Expected Output:
    The capital of USA is Washington DC and
    population is 330000000
    The capital of Kazakhstan is Astana and
    population is 18500000
     */
    String country;
    String capital;
    int population;

    public Varibl122Country(String country1, String capital1, int population1) {
        country = country1;
        capital = capital1;
        population = population1;
    }

    public static void main(String[] args) {
        Varibl122Country location = new Varibl122Country("USA", "Washington DC", 330000000);
        System.out.println("The capital of " +location.country+
                " is " +location.capital+ " and population is " +location.population );

        Varibl122Country location1 = new Varibl122Country("Kazakhstan", "Astana", 18500000);
        System.out.println("The capital of " +location1.country+
                " is " +location1.capital+ " and population is " +location1.population );
    }
}