package ru.netology.stats;

public class StatsService {

    public int getSalesAmount(int[] sales) {
        int salesAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAmount = salesAmount + sales[i];

        }
        return salesAmount;

    }


    public int AverageSalesAmount(int[] sales) {
        int averageSales = 0;
        int salesAmount = 0;
        int months = 12;


        for (int i = 0; i < sales.length; i++) {
            salesAmount = salesAmount + sales[i];

            averageSales = salesAmount / months;
        }
        return averageSales;
    }


    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            //sales[maxMonth]
            //sale
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            //sales[minMonth]
            //sale
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int BelowAverageSalesAmount(int[] sales) {
        int belowAverage = 0;
        int average = AverageSalesAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    public int getAboveAverage(int[] sales) {
        int aboveAverage = 0;
        int month = 0;
        int average = AverageSalesAmount(sales);
        for (long sale : sales) {
            //sales[aboveAverage]
            //sale
            if (sale > average) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}
