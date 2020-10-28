package com.nc.autumn2020.solutions.additional;

import org.apache.commons.io.FileUtils;
import java.util.Base64;
import java.io.*;

public class Decoder {
    private String encodedString;

    private Decoder(Decoder.Builder builder) {
        this.encodedString = builder.encodedString;
    }

    public static class Builder {
        private String pathToTheFile;
        private String encodedString;

        /**
         * @param pathToTheFile
         */
        public Builder(String pathToTheFile) throws IOException {
            this.pathToTheFile = pathToTheFile;
            readBytesFromTheFile();
        }

        public void readBytesFromTheFile() throws IOException {
            FileInputStream fis = new FileInputStream(this.pathToTheFile);
            byte[] bytes = fis.readAllBytes();
            String s = new String(bytes);
            this.encodedString = s;
        }

        public Decoder build() {
            return new Decoder(this);
        }
    }

    public void decode() throws IOException {
        String outputFileName = "Климова Елена Вячеславовна.png";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
    }
}
