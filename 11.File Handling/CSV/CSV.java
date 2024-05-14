import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CSV{
    public static void main(String[] args)throws CsvException{
        String csvFile = "data.csv";
        
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))){
            String[] header = {"Name", "Age", "City"};
            writer.writeNext(header);

            String[] data1 = {"John", "30", "New York"};
            String[] data2 = {"Alice", "25", "London"};
            String[] data3 = {"Bob", "40", "Paris"};

            writer.writeNext(data1);
            writer.writeNext(data2);
            writer.writeNext(data3);

            System.out.println("Data has been written to " + csvFile);
        } catch (IOException e) {
            System.out.println(e);
        }
		
		try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> lines = reader.readAll();

            for (String[] line : lines) {
                for (String value : line) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
