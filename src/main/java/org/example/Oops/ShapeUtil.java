package org.example.Oops;

public class ShapeUtil {
    public static double calculateTotalArea(Shape[] shapes){
        double total=0;

        for (Shape s: shapes){
            total=total+ s.area();

        }
        return total;
    }
}
