package test;

import net.viralpatel.spring.controller.CustomerRestController;

/**
 * Created by sande on 3/22/2017.
 */
public class SprintRestClientExample {

    public static void main(String[] args){

        CustomerRestController controller = new CustomerRestController();
        System.out.println("List Of Customers== " + controller.getCustomers());

    }
}
