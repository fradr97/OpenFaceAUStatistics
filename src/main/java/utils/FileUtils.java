package utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.List;

public class FileUtils {

    public List<String[]> parseCSVFile(String filepath) {
        List<String[]> r;
        try (CSVReader reader = new CSVReader(new FileReader(filepath))) {
            r = reader.readAll();
            return r;
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeFile(String filepath, String string, boolean append) {
        try {
            File file = new File(filepath);

            if(file.createNewFile()) {
                System.out.println("File created.");
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(string);
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
