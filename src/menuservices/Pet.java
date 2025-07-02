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
        do {
            String answerCadastro;
            System.out.print("1: ");
            answerCadastro = input.nextLine();

            if (answerCadastro.isEmpty()) {
                answerCadastro = NOT_INFORMED;
                validation = true;
            }

            validation = answerCadastro.matches("([A-Za-z]+)\\s+([A-Za-z]+)");
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
    }

    public void address() {
        System.out.println("Digite o endereço por completo: ");
        do {
            System.out.println("4: ");
            System.out.print("Endereço: ");
            String answerAddress = input.nextLine();
            if (answerAddress.isEmpty()) {
                answerAddress = NOT_INFORMED;
                validation = true;
            }
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

    public void age() {
        System.out.println("Digite a idade aproximada/aparente do animal: ");
        System.out.print("5: ");

        String answerAge = input.nextLine();

        if (answerAge.isEmpty()) {
            answerAge = NOT_INFORMED;
            validation = true;
        }

        try {
            if (!answerAge.matches("^[0-9]+([,.][0-9]+)?$")) {
                throw new IllegalArgumentException("Idade inválida.");
            }


            int numAge = Integer.parseInt(answerAge);

            if (numAge > 20) {
                throw new IllegalArgumentException("Idade excedida");
            } else if (numAge < 1) {
                System.out.println("0." + numAge);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void height() {
        System.out.println("Digite o peso aproximada/aparente do animal: ");
        System.out.print("6: ");

        String answerHeight = input.nextLine();

        try {
            if (!answerHeight.matches("^[0-9]\\d?$")) {
                throw new IllegalArgumentException("Peso inválida.");
            }


            double numHeight = Integer.parseInt(answerHeight);

            if (numHeight > 60 || numHeight < 0.5) {
                throw new IllegalArgumentException("Peso inválido.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void animalRace() {
        System.out.println("Digite a raça do animal.");
        do {
            System.out.print("7: ");

            String answerTrueRace = input.nextLine();

            if (answerTrueRace.isEmpty()) {
                answerTrueRace = NOT_INFORMED;
                validation = true;
            } else if (!answerTrueRace.matches("([A-Za-z])+\\s([A-Za-x])+")) {
                validation = false;
            } else {
                validation = true;
            }


        } while (!validation);
    }
}
