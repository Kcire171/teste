package teste;

import java.util.Scanner;

public class ImpostoRenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Renda anual com salário: ");
        double rendaSalario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServicos = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = sc.nextDouble();

   
        double salarioMensal = rendaSalario / 12;
        double impostoSalario = 0;
        if (salarioMensal >= 3000 && salarioMensal < 5000) {
            impostoSalario = rendaSalario * 0.10;
        } else if (salarioMensal >= 5000) {
            impostoSalario = rendaSalario * 0.20;
        }

        // Imposto sobre prestação de serviços (15%)
        double impostoServicos = rendaServicos * 0.15;

        // Imposto sobre ganho de capital (20%)
        double impostoCapital = rendaCapital * 0.20;

        double impostoBruto = impostoSalario + impostoServicos + impostoCapital;

        double maxDedutivel = impostoBruto * 0.30;

        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        if (gastosDedutiveis > maxDedutivel) {
            gastosDedutiveis = maxDedutivel;
        }

        double impostoDevido = impostoBruto - gastosDedutiveis;

        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
        System.out.println("* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maxDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);
        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
        System.out.printf("Abatimento: %.2f\n", gastosDedutiveis);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

        sc.close();
    }
}
