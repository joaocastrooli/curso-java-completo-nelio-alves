import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Taxpayer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        
        for (int i=1; i<=taxPayers; i++){
            System.out.println("Tax payer #" + i + "  data:");

            System.out.print("Individual or company (i/c)? ");
            String type = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type.equalsIgnoreCase("i")){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Taxpayer indivudual = new Individual(name, anualIncome, healthExpenditures);

                list.add(indivudual);
            }

            if (type.equalsIgnoreCase("c")) {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                Taxpayer company = new Company(name, anualIncome, numberEmployees);

                list.add(company);
            }
        }


        sc.close();

        double sum = 0;

        System.out.println("\nTAXES PAID: ");
        for (Taxpayer taxpayer : list) {
            System.out.println(taxpayer.getName() + ": $" + taxpayer.taxPaid());
            sum += taxpayer.taxPaid();
        }

        System.out.println("\nTOTAL TAXES: " + sum);
    }
}
