package com.company;

public class CircleWorker {
    private static double circleSquareCalculating(double radius){
        return Math.PI * radius * radius;
    }

    public static double squareOfRingCalculating(double outerCircleRadius, double innerCircleRadius){
        double squareOuterCircle = CircleWorker.circleSquareCalculating(outerCircleRadius);
        double squareInnerCircle = CircleWorker.circleSquareCalculating(innerCircleRadius);
        return squareOuterCircle - squareInnerCircle;
    }
}
