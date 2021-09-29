import utils.FileUtils;
import utils.OpenFaceCSV;

public class Main {
    private static final String OF_DATASET_FILENAME = System.getProperty("user.home") + "/Desktop/video/distracted/OpenFace/webcam_2021-09-20-19-57.csv";
    //concentrated/OpenFace/webcam_2021-09-16-19-23.csv
    //distracted/OpenFace/webcam_2021-09-20-19-57.csv

    private static final String OUTPUT_DATASET_FILENAME = System.getProperty("user.home") + "/Desktop/video/distracted.txt";

    public static void main (String[] args) {
        OpenFaceCSV openFaceCSV = new OpenFaceCSV(OF_DATASET_FILENAME);
        FileUtils fileUtils = new FileUtils();

        int frames = openFaceCSV.getFramesNumber();

        double au01_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU01_r);
        double au02_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU02_r);
        double au04_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU04_r);
        double au05_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU05_r);
        double au06_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU06_r);
        double au07_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU07_r);
        double au09_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU09_r);
        double au10_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU10_r);
        double au12_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU12_r);
        double au14_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU14_r);
        double au15_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU15_r);
        double au17_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU17_r);
        double au20_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU20_r);
        double au23_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU23_r);
        double au25_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU25_r);
        double au26_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU26_r);
        double au45_rDensity = openFaceCSV.getAUDensityAverage(OpenFaceCSV.AU45_r);

        int au01_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU01_c);
        int au02_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU02_c);
        int au04_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU04_c);
        int au05_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU05_c);
        int au06_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU06_c);
        int au07_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU07_c);
        int au09_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU09_c);
        int au10_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU10_c);
        int au12_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU12_c);
        int au14_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU14_c);
        int au15_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU15_c);
        int au17_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU17_c);
        int au20_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU20_c);
        int au23_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU23_c);
        int au25_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU25_c);
        int au26_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU26_c);
        int au28_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU28_c);
        int au45_cOccurrence = openFaceCSV.getAUOccurrences(OpenFaceCSV.AU45_c);

        fileUtils.writeFile(OUTPUT_DATASET_FILENAME,
                "*** Frames: " + frames + "\n\n" +
                        "*** AU occurrences (/" + frames + "):\n  " +
                        "    AU01: " + au01_cOccurrence + "\n  " +
                        "    AU02: " + au02_cOccurrence + "\n  " +
                        "    AU04: " + au04_cOccurrence + "\n  " +
                        "    AU05: " + au05_cOccurrence + "\n  " +
                        "    AU06: " + au06_cOccurrence + "\n  " +
                        "    AU07: " + au07_cOccurrence + "\n  " +
                        "    AU09: " + au09_cOccurrence + "\n  " +
                        "    AU10: " + au10_cOccurrence + "\n  " +
                        "    AU12: " + au12_cOccurrence + "\n  " +
                        "    AU14: " + au14_cOccurrence + "\n  " +
                        "    AU15: " + au15_cOccurrence + "\n  " +
                        "    AU17: " + au17_cOccurrence + "\n  " +
                        "    AU20: " + au20_cOccurrence + "\n  " +
                        "    AU23: " + au23_cOccurrence + "\n  " +
                        "    AU25: " + au25_cOccurrence + "\n  " +
                        "    AU26: " + au26_cOccurrence + "\n  " +
                        "    AU28: " + au28_cOccurrence + "\n  " +
                        "    AU45: " + au45_cOccurrence + "\n\n" +
                        "*** AU Density (0-5):\n  " +
                        "    AU01: " + au01_rDensity + "\n  " +
                        "    AU02: " + au02_rDensity + "\n  " +
                        "    AU04: " + au04_rDensity + "\n  " +
                        "    AU05: " + au05_rDensity + "\n  " +
                        "    AU06: " + au06_rDensity + "\n  " +
                        "    AU07: " + au07_rDensity + "\n  " +
                        "    AU09: " + au09_rDensity + "\n  " +
                        "    AU10: " + au10_rDensity + "\n  " +
                        "    AU12: " + au12_rDensity + "\n  " +
                        "    AU14: " + au14_rDensity + "\n  " +
                        "    AU15: " + au15_rDensity + "\n  " +
                        "    AU17: " + au17_rDensity + "\n  " +
                        "    AU20: " + au20_rDensity + "\n  " +
                        "    AU23: " + au23_rDensity + "\n  " +
                        "    AU25: " + au25_rDensity + "\n  " +
                        "    AU26: " + au26_rDensity + "\n  " +
                        "    AU45: " + au45_rDensity,
                false);
    }
}
