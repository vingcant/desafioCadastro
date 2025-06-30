package menuservices;

public enum Sex {
    MASCULINE("M"),
    FEMALE("F"),
    UNKNOWN("U"),
    ;
    public final String INPUT;

    Sex(String INPUT) {
        this.INPUT = INPUT;
    }

    public String getINPUT() {
        return INPUT;
    }

    public static boolean validSex(String input){
        for(Sex sex : Sex.values()){
            if (sex.name().equalsIgnoreCase(input) || sex.getINPUT().equalsIgnoreCase(input)){
                return true;
            }
        } return false;
    }

    public static Sex isString(String input){
        for (Sex sex : Sex.values()){
            if (sex.name().equalsIgnoreCase(input) || sex.getINPUT().equalsIgnoreCase(input)){
                return sex;
            }
        }return UNKNOWN;
    }
}
