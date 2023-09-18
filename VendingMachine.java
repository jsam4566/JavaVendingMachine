public class VendingMachine {
    public String[][][] products;

    public VendingMachine(int rows, int cols, int depth) {
        products = new String[rows][cols][depth];
    }

    public void addProduct(int row, int col, int depth, String productName) {
        if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[1].length) {
            products[row][col][depth] = productName;
        } else {
            //System.out.println("Invalid location for adding a product.");
        }

    }
    //get product modifers
    public String getProduct(int row, int col, int depth){
        if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[1].length) {
            String product = products[row][col][depth];
            if (product != null){
                products[row][col][depth] = null;
                return product;
            } else {
                return "Empty slot";
            }
        } else {
            return "Invalid location";
        }
    }
    public void display() {
        for (int i = 0; i < products.length; i++) {
            for (int g = 0; g < products[0].length; g++) {
                for (int k = 0; k < products[0][0].length; k++) {
                    String product = products[i][g][k];
                    if (product == null) {
                        System.out.print("[Empty] ");
                    } else {
                        System.out.print("[" + product + "]");
                    }
                }
                System.out.println();
            }
        }
    }

}
