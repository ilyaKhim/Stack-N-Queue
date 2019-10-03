import java.io.*;
public class MyFile {

    private static void ReverseText(File file){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
        Stack stack = new Stack((int)file.length());
        int c;
        while ((c = bufferedReader.read()) != -1) {
            stack.push((char) c);
        }
        while (!stack.isEmpty()) {
            System.out.print((char) stack.pop());
        }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Не удается открыть файл");
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\1\\IdeaProjects\\Studying\\Stack-N-Queue\\src\\MyHomeTask");
        ReverseText(file);
        }
    }
