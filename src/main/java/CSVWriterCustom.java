import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterCustom {
    public static void writeDataLineByLine(String filePath, InstallInfo installInfo)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            String[] stringToWrite = {installInfo.getTimestamp(),
                    installInfo.getNetwork(),
                    installInfo.getCampaign(),
                    installInfo.getGroup()};

            writer.writeNext(stringToWrite);


            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
