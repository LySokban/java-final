package com.shopping;


public class Main {
    public static void main(String[] args) {
        // Create customers for each type
        Customer premiumCustomer = new Customer("Oggy", "Premium");
        Customer goldCustomer = new Customer("Tom", "Gold");
        Customer silverCustomer = new Customer("Spiderman", "Silver");
        Customer normalCustomer = new Customer("Elsa", "Normal");

        // Create sales for each customer
        Sale sale1 = new com.shopping.Sale(premiumCustomer, "2024-02-21");
        Sale sale2 = new Sale(goldCustomer, "2024-02-21");
        Sale sale3 = new Sale(silverCustomer, "2024-02-21");
        Sale sale4 = new Sale(normalCustomer, "2024-02-21");

        // Set service and product expenses for each sale
        sale1.setServiceExpense(100.0);
        sale1.setProductExpense(50.0);

        sale2.setServiceExpense(100.0);
        sale2.setProductExpense(50.0);

        sale3.setServiceExpense(100.0);
        sale3.setProductExpense(50.0);

        sale4.setServiceExpense(100.0);
        sale4.setProductExpense(50.0);

        // Display information about each sale
        sale1.DisplayInfo();
        sale2.DisplayInfo();
        sale3.DisplayInfo();
        sale4.DisplayInfo();
    }
}