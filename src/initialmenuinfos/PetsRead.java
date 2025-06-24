package initialmenuinfos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PetsRead {
    public static void main(String[] args) {
        File file = new File("formulario.txt");

        try(FileReader formReader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(formReader)){
            String forms;

            while((forms = buffReader.readLine()) != null){
                System.out.println(forms);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
