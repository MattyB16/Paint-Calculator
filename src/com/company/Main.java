package com.company;

public class Main {cd Code1
    public static void main(String[] args) {

        int PaintPriceWallsPer10L = 60;
        int PaintPriceDoorsPer10L =40;

        double ThicknessOfPaint = 0.0001;

        double RandomNumber = (Math.random()*40);
        int NumberOfWalls = (int)RandomNumber;
        int AverageAreaOfWall = 2*6;
        int AreaOfWall = NumberOfWalls*AverageAreaOfWall;
        int NumberOfCoatsOnWall = 3;

        int NumberOfDoors = NumberOfWalls/4;
        int AreaOfDoors = NumberOfDoors*2;
        int NumberOfCoatsOnDoor = 2;

        int HourlyLabourCost = 831;
        double HoursWorked = (NumberOfWalls*2 +NumberOfDoors*0.5);
        float LabourCost = (float)((HourlyLabourCost*HoursWorked)/100);

        double AmountOfPaintForWalls10Litre = NumberOfCoatsOnWall*AreaOfWall*ThicknessOfPaint*100;
        double AmountOfPaintForDoors10Litre = NumberOfCoatsOnDoor*AreaOfDoors*ThicknessOfPaint*100;
        double NumberOfPaintCansWalls = (int)Math.ceil(AmountOfPaintForWalls10Litre);
        double NumberOfPaintCansDoors = (int)Math.ceil(AmountOfPaintForDoors10Litre);

        float PaintCost = (float)(PaintPriceWallsPer10L*NumberOfPaintCansWalls + PaintPriceDoorsPer10L*NumberOfPaintCansDoors);

        System.out.println("Number of Walls: " + NumberOfWalls + "\nNumber of Doors: " + NumberOfDoors + "\nTotal Number Of Paint Cans needed: " + (int)(NumberOfPaintCansWalls+NumberOfPaintCansDoors) + "\nTotal Cost of Paint: £"  + PaintCost + "\nHours Worked: " + HoursWorked + "\nLabour Cost: £" + (LabourCost) + "\nTotal Cost: £" + (float)(PaintCost+LabourCost));
    }
}