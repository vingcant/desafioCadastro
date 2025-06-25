package test;

import initialmenuinfos.PetsRead;
import menuservices.InitialMenu;
import menuservices.registerNewPet;

public class TestUm {
    public static void main(String[] args) {
        PetsRead read = new PetsRead();
        registerNewPet newP = new registerNewPet(read);
        InitialMenu men = new InitialMenu(newP);

        men.menu();
    }
}
