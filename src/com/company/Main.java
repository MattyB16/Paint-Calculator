package com.company;

public class Main {
    public static void main(String[] args) {

        int PaintPriceWallsPer10L = 60;
        int PaintPriceDoorsPer10L =40;

        double ThicknessOfPaint = 0.0001;

        double RandomNumberForWalls = (Math.random()*40);
        int NumberOfWalls = 1 + (int)RandomNumberForWalls;
        int AverageAreaOfWall = 2*6;
        int AreaOfWall = NumberOfWalls*AverageAreaOfWall;
        int NumberOfCoatsOnWall = 3;

        int NumberOfDoors = NumberOfWalls/4;
        int AreaOfDoors = NumberOfDoors*2;
        int NumberOfCoatsOnDoor = 2;

        double RandomNumberForPainters = (Math.random()*4);
        int NumberOfPainters = 1 + (int)RandomNumberForPainters;
        int HourlyLabourCost = 831;
        double HoursWorked = (NumberOfWalls*2 +NumberOfDoors*0.5)/NumberOfPainters;
        float LabourCost = (float)((NumberOfPainters*HourlyLabourCost*HoursWorked)/100);

        double AmountOfPaintForWalls10Litre = NumberOfCoatsOnWall*AreaOfWall*ThicknessOfPaint*100;
        double AmountOfPaintForDoors10Litre = NumberOfCoatsOnDoor*AreaOfDoors*ThicknessOfPaint*100;
        double NumberOfPaintCansWalls = (int)Math.ceil(AmountOfPaintForWalls10Litre);
        double NumberOfPaintCansDoors = (int)Math.ceil(AmountOfPaintForDoors10Litre);
        float PaintCost = (float)(PaintPriceWallsPer10L*NumberOfPaintCansWalls + PaintPriceDoorsPer10L*NumberOfPaintCansDoors);

        System.out.println("Invoice from The Simple Mind Painting Company\n\n");

        System.out.println("Number of Walls: " + NumberOfWalls + "\nNumber of Doors: " + NumberOfDoors + "\nTotal Number Of Paint Cans needed: " + (int)(NumberOfPaintCansWalls+NumberOfPaintCansDoors) + "\nTotal Cost of Paint: £"  + PaintCost);

        System.out.println("\nNumber of Painters: " + NumberOfPainters + "\nHours Worked: " + HoursWorked + "\nLabour Cost: £" + (LabourCost));

        System.out.println("\nTotal Cost: £" + (float)(PaintCost+LabourCost));

        System.out.println("\nPlease pay within 5 working days if you wish to keep all your kneecaps :)");

    }
}