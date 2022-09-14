import java.io.File;

public class TaskFirst {
    public static void main(String[] args) {
        File rd = new File("C:\\Users\\11\\Desktop\\JavaProject\\homeworkSeminar2\\Files");
        File[] files = rd.listFiles();
        for (int i = 0; i < files.length; i++) {
            String str = String.valueOf(files[i]);
            String name = getNameFile(str);
            String ex = getFileExtension(str);
            System.out.println("Расширение файла " + '"' + name + '"' + ": " + ex);
        }
    }
    static String getNameFile(String s) {
        int ind = s.lastIndexOf("\\");
        int ind2 = s.lastIndexOf(".");
        String nameFile = s.substring(ind+1, ind2);
        return nameFile;
    }
    static String getFileExtension(String s) {
        int ind = s.lastIndexOf(".");
        String fileExtension = s.substring(ind+1);
        return fileExtension;
    }
}
