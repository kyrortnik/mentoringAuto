package by.epam.pre_mentoring.aircompany.util.i_oStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InOutStreams {

    FileReader in = null;
    FileWriter out = null;

    public void streams() throws IOException{
        try {
            in = new FileReader("src\\by\\epam\\pre_mentoring\\aircompany\\IOStreamsFiles\\input_file.txt");
            out = new FileWriter("src\\by\\epam\\pre_mentoring\\aircompany\\IOStreamsFiles\\output_file.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    }


