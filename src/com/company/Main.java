package com.company;

public class Main {
    public static void main(String[] args) {

        int PaintPriceWallsPer10L = 60;
        int PaintPriceDoorsPer10L =40;
        int PaintInStock =2;

        double ThicknessOfPaint = 0.0001;

        double RandomNumberForWalls = (Math.random()*40);
        int NumberOfWalls = 1 + (int)RandomNumberForWalls;
        int AverageAreaOfWall = 2*6;
        int AreaOfWall = NumberOfWalls*AverageAreaOfWall;
        int NumberOfCoatsOnWall = 3;

        int NumberOfDoors = NumberOfWalls/4;
        int AreaOfDoors = NumberOfDoors*2;
        int NumberOfCoatsOnDoor = 2;


        int HourlyLabourCost = 831;
        double HoursWorked = (NumberOfWalls*2 +NumberOfDoors*0.5);
        int NumberOfPainters;

        if (HoursWorked > 30) {

            NumberOfPainters = 4;
            HoursWorked = HoursWorked/4;
        }
        else if (HoursWorked>15){
            NumberOfPainters = 2;
            HoursWorked = HoursWorked/2;
        }

        else{
            NumberOfPainters = 1;
        }

        float LabourCost = (float)((NumberOfPainters*HourlyLabourCost*HoursWorked)/100);

        double AmountOfPaintForWalls10Litre = NumberOfCoatsOnWall*AreaOfWall*ThicknessOfPaint*100;
        double AmountOfPaintForDoors10Litre = NumberOfCoatsOnDoor*AreaOfDoors*ThicknessOfPaint*100;
        int NumberOfPaintCansWalls = (int)Math.ceil(AmountOfPaintForWalls10Litre);
        int NumberOfPaintCansDoors = (int)Math.ceil(AmountOfPaintForDoors10Litre);
        int NumberOfPaintCans = NumberOfPaintCansWalls +NumberOfPaintCansDoors;
        float PaintCost = (float)(PaintPriceWallsPer10L*NumberOfPaintCansWalls + PaintPriceDoorsPer10L*NumberOfPaintCansDoors);

        String Message;

        switch(NumberOfPaintCans){
            case 1,2:
                Message = "We Have enough paint.";
                break;


            case 3,4:
                Message = "Get 2 more cans.";
                break;

            default:
                Message = "Fully Restock Paint";
                break;
        }

        System.out.println(Message + "\n\n\n");

        System.out.println("Invoice from The Simple Mind Painting Company\n");

        System.out.println("\nNumber of Walls: " + NumberOfWalls + "\nNumber of Doors: " + NumberOfDoors + "\nTotal Number Of Paint Cans needed: " + (int)(NumberOfPaintCansWalls+NumberOfPaintCansDoors) + "\nTotal Cost of Paint: £"  + PaintCost);

        System.out.println("\nNumber of Painters: " + NumberOfPainters + "\nHours Worked: " + HoursWorked + "\nLabour Cost: £" + (LabourCost));

        System.out.println("\nTotal Cost: £" + (float)(PaintCost+LabourCost));


        double TimeTillPayed = (Math.random()*15);

        String Threat = (TimeTillPayed > 5) ? "You are getting Knee Capped." : "Thank you. Have a nice day.";

        System.out.println("\n" + Threat);



    }
}