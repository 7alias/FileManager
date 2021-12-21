import java.io.File;

public class Main {


        public static void main(String[] args) {
            File file = new File("C:\\Users\\Ilmax\\Documents\\IDEA\\2021_practice_week");
            String [] files = file.list();

            System.out.println("Listing contents of: "+ file.getPath());
            for (int i =0; i< files.length; i++){
                System.out.println(files[i]);
                
            }
        }


}
