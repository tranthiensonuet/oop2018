package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        String word = "";
        while ((line = reader.readLine()) != null){
            word = word + line + "\n";
        }
        reader.close();
        return word;
    }

    public static void writeContentToFile(String path, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(text);
        writer.flush();
    }

    public static File findFileByName(String folderPath, String fileName){
        File dictionary = new File(folderPath);
        String [] list = dictionary.list();
        String file = null;
        for (int i = 0; i < list.length; i++){
            if (list[i].equals(fileName))
                file = folderPath;
        }
        if (file == null) return null;
        else{
            file = file + "\\" + fileName;
            File find = new File(file);
            return find;
        }
    }
    public static void main(String[] args) throws IOException {
        String pathread = "D:\\Github\\src\\week9\\read.txt";
        String read = readContentFromFile(pathread);
        System.out.println(read);

        String pathwrite = "D:\\Github\\src\\week9\\write.txt";
        writeContentToFile(pathwrite, read);

        String folderPath = "D:\\Github\\src\\week9";
        String fileName = "read.txt";
        File file = findFileByName(folderPath, fileName);
        System.out.println(file);
    }
}
