import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String OBJECT_LIST_SAMPLE = "./object-list-sample.csv";

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

            try(
                    Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_LIST_SAMPLE));
                    ) {
                StatefulBeanToCsv<CSVUser>beanToCsv = new StatefulBeanToCsvBuilder(writer)
                        .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                        .build();

                List<CSVUser> csvUsers = new ArrayList<>();
                csvUsers.add(new CSVUser("Sundar Pichai ", "sundar.pichai@gmail.com", "+1-11111111", "India"));
                csvUsers.add(new CSVUser("Sam N S ", "s.rajveer@gmail.com", "+1-89898989", "India"));

                beanToCsv.write(csvUsers);

        }
    }
}
