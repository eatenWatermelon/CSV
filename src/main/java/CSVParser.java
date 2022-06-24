import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVParser {

    public CSVParser() {
    }

    public void parse(String fileName) throws IOException {
        Reader in = new FileReader(fileName);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(Rows.NAME.getName())
                .withFirstRecordAsHeader()
                .parse(in);
        for (CSVRecord record : records) {
            String name = record.get(Rows.NAME);
        }
    }
}
