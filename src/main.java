import java.io.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        String line = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/Users/longdo/FileCSV/src/country.csv"));
            while ((line=br.readLine())!=null){
                String[] result = line.split(",");
                System.out.println("Country Code: "+result[4]+", Name: "+result[5]);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
