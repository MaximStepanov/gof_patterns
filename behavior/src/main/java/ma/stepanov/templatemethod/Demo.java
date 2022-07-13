package ma.stepanov.templatemethod;

import ma.stepanov.templatemethod.processors.OrderProcessor;
import ma.stepanov.templatemethod.processors.OrderProcessorForCitizens;
import ma.stepanov.templatemethod.processors.OrderProcessorForForeigners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OrderProcessor processor = null;
        System.out.println("Type username: ");
        String userName = reader.readLine();
        System.out.print("Type password: ");
        String password = reader.readLine();

        System.out.println("\nAre you citizen or no?\n" + "Y - Citizen\n" + "N - Foreign");
        String choice = reader.readLine();

        if ("Y".equalsIgnoreCase(choice)) {
            processor = new OrderProcessorForCitizens(userName, password);
        } else {
            System.out.print("If you are foreign type your ID: ");
            String id = reader.readLine();
            processor = new OrderProcessorForForeigners(userName, password, id);
        }
        String processingResult = processor.orderGuitar();
        System.out.println("Processing result " + processingResult);
    }
}
