package com.oliver;

public class Main {

    public static void main(String[] args) {

        int[] prices = new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250};

        System.out.print("Given the following array of stock prices: ");

        for(int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println();
        System.out.println("The best possible profit if buying and selling once is: " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int profit = 0;
        int price = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > price) {
                int tempProfit = prices[i] - price;
                if(tempProfit > profit) profit = tempProfit;
            } else if(prices[i] < price) {
                price = prices[i];
            }
        }

        return profit;
    }
}
