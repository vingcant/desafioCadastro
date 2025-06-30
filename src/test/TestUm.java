package test;

import initialmenuinfos.PetsRead;
import menuservices.InitialMenu;
import menuservices.Pet;
import menuservices.ReadNewPet;

public class TestUm {
    public static void main(String[] args) {
        PetsRead read = new PetsRead();
        Pet pet = new Pet();
        ReadNewPet newP = new ReadNewPet(read);
        InitialMenu men = new InitialMenu(newP, pet);

        men.menu();
    }
}
