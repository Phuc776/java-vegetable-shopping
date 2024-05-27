import java.io.BufferedReader;
import java.io.FileReader;

public class fe {

	public static void main(String[] args) {
		FileReader fr;
		 try {
			 fr = new FileReader("D:\\Java_HDT\\DoHoa_TH_B2\\Input.txt");
			 BufferedReader br = new BufferedReader(fr);
			 String s;
			 while((s = br.readLine()) != null)
			 {
				 String [] strinfor=s.split(",");
				 System.out.print(strinfor[3]);
			 }
			 fr.close();
		 }catch (Exception e) {
			 
		 }
	}

}
