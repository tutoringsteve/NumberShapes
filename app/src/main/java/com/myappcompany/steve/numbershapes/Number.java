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
        if(number==0){
            return true;
        }
        ArrayList<Integer> squares = new ArrayList<>();
        for(int root = 1; root*root <= number; root++) {
            squares.add(root*root);
        }
        return squares.contains(number);
    }

    /**
     * Is the number a triangular number?
     * @return Returns true iff the number is a triangular number
     */
    public boolean isTriangular() {
        if(number==0){
            return true;
        }
        ArrayList<Integer> triangles = new ArrayList<>();
        Integer sum = 0;
        for(int i = 1; sum <= number; i++){
            sum += i;
            triangles.add(sum);
        }
        return triangles.contains(number);
    }

    Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
