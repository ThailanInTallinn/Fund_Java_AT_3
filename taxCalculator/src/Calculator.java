import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String userName = sc.nextLine();
        System.out.print("Insira o seu salário mensal: ");
        double monthlyWage = sc.nextDouble();

        double annualWage = monthlyWage * 12;
        double tax = 0;
        double netSalary = 0;

        if(annualWage >= 22847.77 && annualWage <= 33919.80) {
            tax = annualWage * (7.5 / 100);
        } else if(annualWage >= 33919.81 && annualWage <= 45012.60) {
            tax = annualWage * (15.0 / 100);
        } else if(annualWage > 45012.61) {
            tax = annualWage * (27.5 / 100);
        }

        netSalary = annualWage - tax;
        System.out.print("Imposto a ser pago: " + (tax > 0? tax : "Isento"));
        System.out.println();
        System.out.print(String.format("Salário líquido: %.2f", netSalary));
    }
}
