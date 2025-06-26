package menuservices;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InitialMenu {
    Scanner input = new Scanner(System.in);
    private registerNewPet newPet;

    public InitialMenu(registerNewPet newPet) {
        this.newPet = newPet;
    }


    public void menu() {
        String option;
        boolean validation;

        do{
        System.out.println("Bem vindo ao sistema da Petshoperia!");
        System.out.println("Selecione uma das opções seguintes para continuar.");
        System.out.println("Opção 1: Cadastrar um novo pet.");
        System.out.print("Digite a opção: ");

        option = input.nextLine();
        validation = option.matches("^[1-6]$");
        if (!validation) {
            System.out.println("Nenhuma das opções foi acessada. Tente novamente. ");
            System.out.println();
        }
     }  while (!validation);

            switch (option) {
                case "1":
                    newPet.superRead();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

            }
        }
    }

