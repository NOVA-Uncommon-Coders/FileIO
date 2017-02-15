package com.theironyard.novauc;

/**
 * Created by souporman on 2/15/17.
 */
public class Massage {
    String masseuse;
    int lengthOfTime;
    int price;
    int yelpRating;
    String specialty;

    public String getMasseuse() {
        return masseuse;
    }

    public void setMasseuse(String masseuse) {
        this.masseuse = masseuse;
    }

    public int getLengthOfTime() {
        return lengthOfTime;
    }

    public void setLengthOfTime(int lengthOfTime) {
        this.lengthOfTime = lengthOfTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(int yelpRating) {
        this.yelpRating = yelpRating;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void print() {
        String pMasseuse=getMasseuse();
        int pLengthOfTime = getLengthOfTime();
        int pPrice = getPrice();
        int pYelpRating = getYelpRating();
        String pSpecialty = getSpecialty();

        System.out.printf("\nMASSEUSE NAME  :%s\n", pMasseuse);
        System.out.printf("OFFERS %s MINUTE SERVICE\n", pLengthOfTime);
        System.out.printf("PRICE:  $%s PER SESSION\n", pPrice);
        System.out.printf("SPECIALTY :%s \n", pSpecialty);
        System.out.printf("YELP RATING  %s STARS\n", pYelpRating);

    }
}
