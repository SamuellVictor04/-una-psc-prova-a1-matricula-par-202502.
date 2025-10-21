//SAMUEL VICTOR GONÇALVES DA SILVA - RA: 42522694
//UNA CONTAGEM - 202502

public class ArattaiGrowthTracker {
    public static void main(String[] args) {
        int[] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};

        int totalDownloads= 0, 
        maior= 0, 
        diaMaior = 0, 
        menor=9999999, 
        diaMenor =0;
        int metaDiaria = 1000000, 
        diasAcimaDaMeta = 0;

        System.out.println("\n=== Análise Arattai (7 dias) ===");

        for (int i = 0; i < downloadsDiarios.length; i++) {
            totalDownloads = totalDownloads + downloadsDiarios[i];
        }

        System.out.println("\nTotal de downloads na semana: " + totalDownloads);

        for (int i = 0; i < downloadsDiarios.length; i++) {
            if (downloadsDiarios[i] > maior) {
                maior = downloadsDiarios[i];
                diaMaior = i;
            }
            if (downloadsDiarios[i] < menor) {
                menor = downloadsDiarios[i];
                diaMenor = i;
            }
        }

        System.out.println("\nAnálise de Picos de Downloads:");
        System.out.println("Dia de Pico de Downloads: (" + diasDaSemana[diaMaior] + ") com (" + maior + ") downloads.");
        System.out.println("Dia de Mínimo de Downloads: (" + diasDaSemana[diaMenor] + ") com (" + menor + ") downloads.");

        System.out.println("\nAnálise de Metas (Meta Diária: 1000000):");

        for (int i = 0; i < downloadsDiarios.length; i++) {
            if (downloadsDiarios[i] >= metaDiaria) {
                diasAcimaDaMeta++;
                System.out.println(diasDaSemana[i]+ ": SUCESSO. ("+downloadsDiarios[i]+") downloads.");
            } else {
                System.out.println(diasDaSemana[i]+ ": Não atingiu. ("+downloadsDiarios[i]+") downloads.");
            }
        }


        System.out.println("\nRelatório Final: O Arattai superou a meta diária de download em ("+diasAcimaDaMeta+") dias esta semana.");



        
        
    }
}