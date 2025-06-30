package menuservices;
import exception.InvalidName;
import java.util.Scanner;

public class Pet {
    Race race;
    Sex sex;
    final String NOT_INFORMED = "Não informado";
    Scanner input = new Scanner(System.in);
    String answer;
    boolean validation;

    public void cadastro() {
        System.out.println("Digite a seguir as respostas de acordo com a numeração.");
        System.out.println("Apenas nome e sobrenome com letra maiscula são permitidos.");
        do {
            System.out.print("1: ");
            answer = input.nextLine();

            validation = answer.matches("([A-Z]+)\s+([A-Z]+)");
            if (!validation) {
                try {
                    throw new InvalidName();
                } catch (InvalidName e) {
                    e.printStackTrace();
                }
            }
        } while (!validation);

        System.out.println("Digite a letra correspondente à raça.");
        do {
            System.out.print("2: ");
            answer = input.nextLine().toUpperCase();
            if (Race.validRace(answer)){
                race = Race.isString(answer);
                validation = true;
            }else{
                System.out.println("Invalid race.");
                validation = false;
            }

        } while (!validation);


        System.out.println("Digite a letra correspondente ao sexo entre Cat e Dog.");
        do {
            System.out.print("3: ");
            answer = input.nextLine().toUpperCase();
            if (Sex.validSex(answer)){
                sex = Sex.isString(answer);
                validation = true;
            }else{
                System.out.println("Unknown sex.");
                validation = false;
            }

        } while (!validation);

    }
}
