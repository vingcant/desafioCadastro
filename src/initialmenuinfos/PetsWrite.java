package initialmenuinfos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PetsWrite {
    public static void main(String[] args) {
        File file = new File("formulario.txt");

        try (FileWriter form = new FileWriter(file); BufferedWriter bufForm = new BufferedWriter(form)) {
            bufForm.write("1 - Qual o nome e sobrenome do pet?");
            bufForm.newLine();
            bufForm.write("2 - O pet é um cachorro ou gato?");
            bufForm.newLine();
            bufForm.write("3 - Qual o sexo do animal?");
            bufForm.newLine();
            bufForm.write("4 - Qual o endereço e bairro que ele foi encontrado?");
            bufForm.newLine();
            bufForm.write("5 - Qual a idade aproximada do pet?");
            bufForm.newLine();
            bufForm.write("6 - Qual o peso aproximado do pet?");
            bufForm.newLine();
            bufForm.write("7 - Qual a raça do pet?");
            bufForm.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
