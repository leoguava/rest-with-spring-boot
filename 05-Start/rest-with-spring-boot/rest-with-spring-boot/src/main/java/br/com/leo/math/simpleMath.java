package br.com.leo.math;


public class simpleMath {

    public Double sum(Double numberOne,
                      Double numberTwo) {


        return (numberOne) + (numberTwo);

    }

    public Double mult(
            Double numberOne,
            Double numberTwo) {


        return (numberOne) * (numberTwo);

    }


    public Double mean(
            Double numberOne,
            Double numberTwo) {


        return ((numberOne) + (numberTwo)) / 2;

    }


    public Double div(
            Double numberOne,
            Double numberTwo) {


        return (numberOne) / (numberTwo);

    }


    public Double srq(
            Double numberOne) {


        return Math.sqrt((numberOne));

    }
}
