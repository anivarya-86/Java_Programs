package again;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MakeFile {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter the File Name :");
        String FileName = input.next();

        try(FileReader reader = new FileReader(FileName)){
            int read;
            while ((read = reader.read()) != -1) {
                System.out.println((char)read);
            }

        } catch (FileNotFoundException fileNotFoundException){
            System.out.printf("File are not found : %s ",
                    fileNotFoundException.getMessage() );
        }catch (IOException ioException){
            System.out.printf("Exception Occurred : %s",
                    ioException.getMessage() );

        }
    }
}
