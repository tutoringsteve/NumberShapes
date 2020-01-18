package com.myappcompany.steve.numbershapes;

import java.util.ArrayList;

/**
 * Created by Steven Sarasin on 1/18/2020.
 * A number container class that has some helper methods related to determining the "Shape" of
 * the number, such as whether it is square or triangular.
 */

class Number {

    private Integer number;

    Number() {
        this.number = 1;
    }

    Number(String number){
        this.number = Integer.parseInt(number);
    }

    Number(Integer number) {
        this.number = number;
    }

    Number(int number) {
        this((Integer) number);
    }

    /**
     * Is the number a square number?
     * @return Returns true iff the number is a square number
     */
    public boolean isSquare() {

        Double dblNumber = Double.parseDouble(number.toString());

        return Math.sqrt(dblNumber) == Math.floor(Math.sqrt(dblNumber));
    }

    /**
     * Is the number a triangular number?
     * @return Returns true iff the number is a triangular number
     */
    public boolean isTriangular() {
        if(number==0){
            return true;
        }

        int x = 1;
        int triangularNumber = 1;
        while(triangularNumber < number) {
            x++;
            triangularNumber+=x;
        }
        return number == triangularNumber;
    }

    Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
