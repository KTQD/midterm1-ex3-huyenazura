import java.io.*;


public class Main {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) 
             {

            String line;
            while ((line = reader.readLine()) != null) {
                // Thay thế từ "Nha Trang" bằng "Vũng Tàu"
                line = line.replace("Nha Trang", "Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Đã thay thế và ghi nội dung vào file output.txt");

        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
        }
    }
}
