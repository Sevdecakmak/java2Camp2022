import java.util.Currency;

public class Main {

    public static void main(String[] args) {
        //OOP 1
        String message = "Vade Oranı ";

        Product product1 = new Product();
        product1.setName("Delongi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("mm.jpg");

        //System.out.println(product1.name +product1.unitPrice +product1.discount +product1.unitPrice +product1.imageUrl);

        Product product2 = new Product();
        product2.setName("Smeg kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("mm.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("mm.jpg");


        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }

        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setPhone("055555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demirog");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("KodlamaİO");
        corporateCustomer.setPhone("0533333");
        corporateCustomer.setTaxNumber("1111111");
        corporateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer, corporateCustomer};
        CorporateCustomer[] corporateCustomers = {corporateCustomer};
        IndividualCustomer[] individualCustomers = {individualCustomer};

        for (CorporateCustomer sevde : corporateCustomers) {
            System.out.println(sevde.getCompanyName() + "\n" + sevde.getId() + "\n" + sevde.getPhone());
        }
        for (IndividualCustomer  individualCustomer1 : individualCustomers) {
            System.out.println(individualCustomer1.getFirstName() + "\n" + individualCustomer1.getLastName());
        }


        for (Customer customer1 : customers) {
            System.out.println(customer1.getId() + "\n" + customer1.getCustomerNumber() + "\n" + customer1.getPhone());
        }
 /*       for (Customer customer2 : customers) {
            System.out.println(customer2.getPhone() + customer2.getCustomerNumber() + customer2.());
        }
*/


    }
}
