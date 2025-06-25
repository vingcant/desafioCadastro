package menuservices;

import java.util.Scanner;

public class InitialMenu {
    private registerNewPet newPet;

    public InitialMenu(registerNewPet newPet) {
        this.newPet = newPet;
    }

    Scanner input = new Scanner(System.in);


    public void menu(){
        System.out.println("Bem vindo ao sistema da Petshoperia!");
        System.out.println("Selecione uma das opções seguintes para continuar.");
        System.out.println("Opção 1: Cadastrar um novo pet.");
        System.out.print("Digite a opção: ");
        int option = input.nextInt();
        switch (option){
            case 1:
                newPet.superRead();

        }




    }
}
