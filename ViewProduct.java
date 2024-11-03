public class ViewProduct extends Option {
    public void execute() {
        System.out.println("Viewing products in the inventory...");
        // Here you can add the logic to display a product list if desired.

        System.out.println("=========================");
        System.out.println("        PRODUCTS     ");
        System.out.println("=========================");
        System.out.println();
        System.out.println("Select a product category:");
        System.out.println("1. Cement & Concrete");
        System.out.println("2. Metal Products");
        System.out.println("3. Wood Products");
        System.out.println("4. Tools");
        System.out.println("5. Aggregates (Sand & Gravel)");
        System.out.println("6. Paints & Finishes");
        System.out.println("7. Plumbing Supplies");
        System.out.println("8. Exit");
        System.out.println("Enter product: ");
    }
}