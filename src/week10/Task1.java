package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static List<String> getAllFunctions(File path) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(path));
        List<String> allFunctions = new ArrayList<>();
        String line;
        String value = "";
        while ((line = in.readLine()) != null) {
            int index = line.indexOf("static");
            int demMoNgoac = 1;
            int demDongNgoac = 0;
            if (index != -1) {
                value = value + line + "\n";
                while ((line = in.readLine()) != null) {
                    index = line.indexOf("{");
                    if (index != -1) demMoNgoac++;
                    index = line.indexOf("}");
                    if (index != -1) demDongNgoac++;
                    value = value + line + "\n";
                    if (demDongNgoac == demMoNgoac) {
                        allFunctions.add(value);
                        value = "";
                        break;
                    }
                }
            }

        }
        return allFunctions;
    }

    public static String findFunctionByName(String name) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D:\\Github\\src\\week9\\Utils.java"));
        String line;
        String value = "";
        String functionContent = "";
        String functionName = name.substring(0, name.indexOf("("));

        while ((line = in.readLine()) != null) {
            int index = line.indexOf(functionName);
            int index1 = line.indexOf("{");

            int demMoNgoac = 1;
            int demDongNgoac = 0;
            if (index != -1 & index1 != -1) {
                value = functionName;
                int i = line.indexOf("(");
                char[] linee = line.toCharArray();

                Boolean append = true;
                while (linee[i] != ')') {
                    if (linee[i] == ' ') append = false;
                    if (linee[i] == ',') {
                        value = value + linee[i];
                        append = true;
                        while (linee[++i] == ' ') ;
                    }
                    if (append) value = value + linee[i];
                    i++;
                }
                value = value + ")";

                if (value.equals(name)) {
                    functionContent = functionContent + line + "\n";
                    while ((line = in.readLine()) != null) {
                        index = line.indexOf("{");
                        if (index != -1) demMoNgoac++;
                        index = line.indexOf("}");
                        if (index != -1) demDongNgoac++;
                        functionContent = functionContent + line + "\n";
                        if (demDongNgoac == demMoNgoac) {
                            functionContent = functionContent.replace("/*", "");
                            functionContent = functionContent.replace("*/", "");

                            return functionContent;
                        }
                    }
                }
            }
        }
        return functionContent;
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\Github\\src\\week9\\Utils.java";
        File file = new File(path);
        List<String> allFunctions = getAllFunctions(file);

        System.out.println(findFunctionByName(new String("findFileByName(String,String)")));
    }
}
