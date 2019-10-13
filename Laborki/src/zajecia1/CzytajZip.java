package zajecia1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CzytajZip {

	public static void main(String[] args) throws IOException{
		ZipInputStream zin = new ZipInputStream(
				new FileInputStream("przyklad.zip")
				);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(zin)
				);
		// czytamy tekst
		ZipEntry ze;
		String wiersz;
		while((ze = zin.getNextEntry())!= null){
			System.out.println(ze.getName());
			System.out.println("--------------");
			while((wiersz = br.readLine()) != null){
				System.out.println(wiersz);
			}
			zin.closeEntry();
		}
		zin.close();
		
	}

}
