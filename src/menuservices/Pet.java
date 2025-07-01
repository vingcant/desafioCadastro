package menuservices;

import exception.InvalidName;

import java.util.Scanner;

public class Pet {
    private Race race;
    private Sex sex;
    final String NOT_INFORMED = "Não informado";
    Scanner input = new Scanner(System.in);

    boolean validation;

    public void cadastro() {
        System.out.println("Digite a seguir as respostas de acordo com a numeração.");
        System.out.println("Apenas nome e sobrenome com letra maiscula são permitidos.");
        do {
            String answerCadastro;
            System.out.print("1: ");
            answerCadastro = input.nextLine();

            validation = answerCadastro.matches("([A-Z]+)\s+([A-Z]+)");
            if (!validation) {
                try {
                    throw new InvalidName();
                } catch (InvalidName e) {
                    e.printStackTrace();
                }
            }
        } while (!validation);
    }

    public void raceCadastro() {


        System.out.println("Digite a letra correspondente à raça.");
        do {
            String answerRace;
            System.out.print("2: ");
            answerRace = input.nextLine().toUpperCase();
            if (Race.validRace(answerRace)) {
                race = Race.isString(answerRace);
                validation = true;
            } else {
                System.out.println("Invalid race.");
                validation = false;
            }

        } while (!validation);
    }

    public void sexCadastro() {

        System.out.println("Digite a letra correspondente ao sexo.");
        do {
            String answerSex;
            System.out.print("3: ");
            answerSex = input.nextLine().toUpperCase();
            if (Sex.validSex(answerSex)) {
                sex = Sex.isString(answerSex);
                validation = true;
            } else {
                System.out.println("Unknown sex.");
                validation = false;
            }

        } while (!validation);

        System.out.println("Digite o endereço por completo: ");
        do {
            System.out.println("4: ");
            System.out.print("Endereço: ");
            String answerAddress = input.nextLine();
            if (!answerAddress.matches("([A-Z\\sa-z])+([0-9])+")) {
                System.out.println("Endereço inválido com o reconhecido pelo sistema.");
                validation = false;
                continue;
            }
            System.out.print("Cidade: ");
            String answerCity = input.nextLine();
            if (!answerCity.matches("([A-Z\\sa-z])+")) {
                System.out.println("Cidade inválida pelo sistema.");
                validation = false;
                continue;
            }
            System.out.print("Rua: ");
            String answerStreet = input.nextLine();
            if (!answerStreet.matches("([A-Z\\sa-z])+")) {
                System.out.println("Rua inválida pelo sistema.");
                validation = false;
            }

        } while (!validation);
    }
}
