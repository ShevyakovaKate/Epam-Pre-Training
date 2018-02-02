package com.company;

public class CircleWorker {
    private static double calcuklateCircleSquare(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateSquareOfRing(double outerCircleRadius, double innerCircleRadius){
        double squareOuterCircle = CircleWorker.circleSquareCalculating(outerCircleRadius);
        double squareInnerCircle = CircleWorker.circleSquareCalculating(innerCircleRadius);
        return squareOuterCircle - squareInnerCircle;
    }
}
