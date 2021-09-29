package utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenFaceCSV {
    public static final String AU01_r = "AU01_r";
    public static final String AU02_r = "AU02_r";
    public static final String AU04_r = "AU04_r";
    public static final String AU05_r = "AU05_r";
    public static final String AU06_r = "AU06_r";
    public static final String AU07_r = "AU07_r";
    public static final String AU09_r = "AU09_r";
    public static final String AU10_r = "AU10_r";
    public static final String AU12_r = "AU12_r";
    public static final String AU14_r = "AU14_r";
    public static final String AU15_r = "AU15_r";
    public static final String AU17_r = "AU17_r";
    public static final String AU20_r = "AU20_r";
    public static final String AU23_r = "AU23_r";
    public static final String AU25_r = "AU25_r";
    public static final String AU26_r = "AU26_r";
    public static final String AU45_r = "AU45_r";

    public static final String AU01_c = "AU01_c";
    public static final String AU02_c = "AU02_c";
    public static final String AU04_c = "AU04_c";
    public static final String AU05_c = "AU05_c";
    public static final String AU06_c = "AU06_c";
    public static final String AU07_c = "AU07_c";
    public static final String AU09_c = "AU09_c";
    public static final String AU10_c = "AU10_c";
    public static final String AU12_c = "AU12_c";
    public static final String AU14_c = "AU14_c";
    public static final String AU15_c = "AU15_c";
    public static final String AU17_c = "AU17_c";
    public static final String AU20_c = "AU20_c";
    public static final String AU23_c = "AU23_c";
    public static final String AU25_c = "AU25_c";
    public static final String AU26_c = "AU26_c";
    public static final String AU28_c = "AU28_c";
    public static final String AU45_c = "AU45_c";

    private final String OFDatasetFile;

    public OpenFaceCSV(String inputFile) {
        this.OFDatasetFile = inputFile;
    }

    public int getFramesNumber() {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(this.OFDatasetFile));
                CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
        ) {
            return parser.getRecords().size();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int getAUOccurrences(String AUHeader) {
        float sum = 0;

        try (
                Reader reader = Files.newBufferedReader(Paths.get(this.OFDatasetFile));
                CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
        ) {
            for (CSVRecord csvRecord : parser) {
                sum += Float.parseFloat(csvRecord.get(AUHeader));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Math.round(sum);
    }

    public double getAUDensityAverage(String AUHeader) {
        int count = 0;
        float sum = 0;

        try (
                Reader reader = Files.newBufferedReader(Paths.get(this.OFDatasetFile));
                CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
        ) {
            for (CSVRecord csvRecord : parser) {
                sum += Float.parseFloat(csvRecord.get(AUHeader));
                count ++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.round(sum / count, 2);
    }

    private double round(double value, int scale) {
        return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
    }
}
