package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBException;

public class Test {
	
	public static void main(String[] args) throws IOException, JAXBException {
		
		//×Ö½ÚÁ÷
		InputStream is = new FileInputStream("C:\\a.txt");
		OutputStream os = new FileOutputStream("C:\\b.txt");
		
		int len = -1;
		byte[] b = new byte[1000];
		
		while((len = is.read(b)) != -1){
			System.out.println("abc" + new String(b,0,len));
			os.write(b,0,len);
		}
		
		is.close();
		os.close();
		
		//×Ö·ûÁ÷
		Reader fr = new FileReader("C:\\a.txt");
		Writer wr = new FileWriter("C:\\c.txt", true);
		char[] cr = new char[100];
		while(fr.read(cr) != -1){
			System.out.println(cr);
			wr.write(cr);
		}
		
		fr.close();
		wr.close();
		
		//»º´æ
		BufferedReader br = new BufferedReader(new FileReader("C:\\a.txt"));
		BufferedWriter wr1 = new BufferedWriter(new FileWriter("C:\\e.txt"));
		String str = null;
		
		while((str = br.readLine()) != null){
			System.out.println(str);
			wr1.write(str+"\n");
		}
		br.close();
		wr1.close();
	}  
}
