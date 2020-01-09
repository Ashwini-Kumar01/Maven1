import java.io.File;
import java.io.IOException;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello Ashwini");
		System.out.println("Hello Ashwini");
		
		File file = new File("C:\\newfile.txt");
		file.createNewFile();
	}

}
