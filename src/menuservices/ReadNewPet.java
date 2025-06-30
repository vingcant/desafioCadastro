package menuservices;

import initialmenuinfos.PetsRead;


public class ReadNewPet {
    protected PetsRead read;

    public ReadNewPet(PetsRead read) {
        this.read = read;
    }

    public void superRead(){
        read.lines();
    }


}

