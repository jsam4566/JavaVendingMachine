public class Prices {
    public double[][][] prices;
//this is prices class
    public Prices(int rows, int cols, int depth) {
        prices = new double[rows][cols][depth];
    }

    public void addPrices(int row, int col, int depth, double price) {
        if (row >= 0 && row < prices.length && col >= 0 && col < prices[0].length && depth >= 0 && depth < prices[1].length) {
            prices[row][col][depth] = price;
        } else {
            //System.out.println("Invalid location for adding a price.");
        }


    }
    //get price
    public double getPrices(int row, int col, int depth) {
        if (row >= 0 && row < prices.length && col >= 0 && col < prices[0].length && depth >= 0 && depth < prices[1].length) {
            double price = prices[row][col][depth];
            if (prices != null) {
                prices[row][col][depth] = 0;
                return price;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void display() {
        for (int u = 0; u < prices.length; u++) {
            for (int f = 0; f < prices[0].length; f++) {
                for (int d = 0; d < prices[0][0].length; d++) {
                    double price = prices[u][f][d];
                    {
                        System.out.print("[$ " + price + "]");
                    }
                }
                System.out.println();
            }
        }
    }






}