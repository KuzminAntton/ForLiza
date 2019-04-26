import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, InstallInfo> map = new HashMap<String, InstallInfo>();
        map.put("1", new InstallInfo("1", "2", "3", "4"));


        for(String key : map.keySet()) {
            CSVWriterCustom.writeDataLineByLine("C:\\New folder\\liza.csv", map.get(key));
        }




    }
}
