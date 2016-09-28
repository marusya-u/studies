
import java.io.*;


public class Game
{


    public static void main(String [] args)
    {


        try
        {
            FileReader fileReader =
                    new FileReader("INPUT_GAME.TXT");

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            
            int first = Integer.parseInt(line);
            int second = 9;
            int third = second - first;


            int result = Integer.valueOf(String.valueOf(first) 
                + String.valueOf(second) + String.valueOf(third));


            PrintWriter writer = new PrintWriter("OUTPUT_GAME.TXT", "UTF-8");
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