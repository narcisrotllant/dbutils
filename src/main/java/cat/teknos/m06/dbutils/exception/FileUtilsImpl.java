package cat.teknos.m06.dbutils.exception;

import java.io.*;

public class FileUtilsImpl implements FileUtils {
    @Override
    public void toUtf8(ValidCharset charset, String from, String to){
        var fileFrom = new File(from);

        // TODO: tests

        try (  var inputStream = new BufferedReader(new FileReader(fileFrom))){
            int character;
        while(character = inputStream.read() > 0){
            // TODO: write with utf8 charset

        }
        } catch(FileNotFoundException e) {

        }catch(IOException e){

        }

    }

}
