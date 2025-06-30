package exception;

public class InvalidName extends Exception {

    public InvalidName(){
      super("Invalid name. A first and  last name are required. Only letters A-Z are allowed.");
    }

    public InvalidName(String message) {
        super(message);
    }
}
