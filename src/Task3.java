import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class Task3 {
    public static void main(String[] args) throws IOException {
        String line = getStringForFile();
        StringBuilder str = new StringBuilder();
        int count = 0;
        String[] listLine = line.split("\"");
        for (int i = 0; i < listLine.length; i++) {
           if (count == 3) {
               str.append("\n");
               count = 0;
           }
           if (listLine[i].equals("фамилия")) {
               str.append("Студент ");
               str.append(String.valueOf(listLine[i+2]));
               count++;
           } else if (listLine[i].equals("оценка")) {
               str.append(" получил ");
               str.append(String.valueOf(listLine[i+2]));
               count++;
           } else if (listLine[i].equals("предмет")) {
               str.append(" по предмету ");
               str.append(String.valueOf(listLine[i+2]) + ".");
               count++;
           }
        }
        try (FileWriter fw = new FileWriter("file.txt")){
            fw.write(String.valueOf(str));
        }
    }
    static String getStringForFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\11\\Desktop\\JavaProject\\homeworkSeminar2\\src\\File.txt"));
        String str = br.readLine();
        br.close();
        return str;
    }
}
