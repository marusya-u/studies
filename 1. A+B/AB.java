
import java.io.*;


public class AB
{


    public static void main(String [] args)
    {


        try
        {
            FileReader fileReader =
                    new FileReader("INPUT_AB.TXT");

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            String[] split = line.split(" ",2);

            int result = Integer.parseInt(split[0]) +
                    Integer.parseInt(split[1]);

            
            PrintWriter writer = new PrintWriter("OUTPUT_AB.TXT", "UTF-8");
            writer.println(result);
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