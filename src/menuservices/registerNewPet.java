package menuservices;

import initialmenuinfos.PetsRead;


public class registerNewPet {
    protected PetsRead read;

    public registerNewPet(PetsRead read) {
        this.read = read;
    }

    public void superRead(){
        read.lines();
    }
}

