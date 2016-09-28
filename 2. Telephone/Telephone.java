
import java.io.*;


public class Telephone
{


    public static void main(String [] args)
    {


        try
        {
            FileReader fileReader =
                    new FileReader("INPUT_TELEPHONE.TXT");

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            
            PrintWriter writer = new PrintWriter("OUTPUT_TELEPHONE.TXT", "UTF-8");
            writer.println(line);
            writer.close();

        }

        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file");
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file");
        }


    }
}