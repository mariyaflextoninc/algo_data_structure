import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class WordCount {
	public static void main(String[] args) {
		getWordCount("C:\\Users\\Mariya\\CANVAS WORKS\\JAVA\\flexton work\\TryPrograms\\src\\mytest.TXT");
	}
	public static void getWordCount(String fileName){
		try{
			File file = new File(fileName);
			System.out.println("correct"+file.exists());
			if(file.exists() && !(file.isDirectory())){
				FileReader fio = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fio);
				String str = null;
				HashMap<String, Integer> hMap = new HashMap();
				while((str = br.readLine())!= null){
					String str1 = str.replaceAll("[!.,\"()]?","");
					String[] arr = str1.split("[\\s+]");
					int i =0;
					while(i<arr.length){
						if(hMap.containsKey(arr[i].toLowerCase())){
							hMap.put(arr[i].toLowerCase(),hMap.get(arr[i].toLowerCase())+1);
					
						}else{
							hMap.put(arr[i].toLowerCase(),1 );
						}
						System.out.println(arr[i] +","+hMap.get(arr[i].toLowerCase()));
						i++;
					}
				}
			}	
		}
		catch(IOException io){
			System.out.println(io.getMessage());
		}
	}
	

}
