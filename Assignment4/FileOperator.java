package homework4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileOperator {
	
/*This method reads the file located in the given file path, 
 * parses the file content to Term objects, 
 * stores the terms in an array,
 * returns the term array
 */
	public int[][] readTerms(String filePath) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			int fileSize = Integer.parseInt(br.readLine());
			int [][] fileData = new int[fileSize][2];

			for (int i = 0; i < fileSize; i++) {
				String line = br.readLine().trim();
				int from = Integer.parseInt(line.split("\t")[0]);
				int to = Integer.parseInt(line.split("\t")[1]);
				fileData[i][0] = from;
				fileData[i][1] = to;
			}
			br.close();
			return fileData;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
