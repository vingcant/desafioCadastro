package menuservices;

public enum Race {
    CAT("C"),
    DOG("D"),
    ;
    public final String INPUT;

    Race(String INPUT) {
        this.INPUT = INPUT;
    }

    public String getINPUT() {
        return INPUT;
    }

    public static boolean validRace(String input){
        for(Race race : Race.values()){
            if (race.name().equalsIgnoreCase(input) || race.getINPUT().equalsIgnoreCase(input)){
                return true;
            }
        } return false;
    }

    public static Race isString(String input){
        for (Race race : Race.values()){
            if (race.name().equalsIgnoreCase(input) || race.getINPUT().equalsIgnoreCase(input)){
                return race;
            }
        }throw new IllegalArgumentException("Invalid race: "+input);
    }
}
