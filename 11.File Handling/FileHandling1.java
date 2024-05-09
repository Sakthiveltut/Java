import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;

public class FileHandling1{

	public static void main(String[] args)throws IOException{
		
		//Scanner sc = new Scanner();
		
		//create one folder
		File file1 = new File("E:\\Zoho\\File Handling\\test");
		//if(!file1.exists())
			file1.mkdir();
		
		//create multiple sub folder
		File file2 = new File("E:\\Zoho\\File Handling\\test\\1\\2\\3\\4\\5");
		if(!file2.exists()) 
			file2.mkdirs();
		
		//create new file
		File file3 = new File("E:\\Zoho\\File Handling\\test\\test1.txt");
		//file3.delete();
		file3.createNewFile();
			
		//rename file
		File file4 = new File("E:\\Zoho\\File Handling\\test\\test3.txt");
		//file4.createNewFile();
		file3.renameTo(file4);
		System.out.println(file4.getName());
		
		System.out.println(file4.canRead());
		System.out.println(file4.canWrite());
		System.out.println(file4.canExecute());
		
		File file5 = new File("E:\\Zoho\\File Handling\\test");
		System.out.println(Arrays.toString(file5.list()));
		for(File f:file5.listFiles()){
				if(f.isFile())
					System.out.println("File "+f);
				if(f.isDirectory())
					System.out.println("Folder "+f);
		}
		
		//FileWriter
		File file6 = new File("E:\\Zoho\\File Handling\\test\\test1.txt");
		FileWriter writer = new FileWriter(file6);
		//FileWriter writer = new FileWriter(file6,true);
		writer.write("hello wrld ");
		writer.write("\nhello world ");
		writer.write("\nhello world ");
		writer.flush();
		writer.close();
		
		//FileReader
		FileReader fileReader = new FileReader(file6);
		int output = fileReader.read();
		while(output!=-1){
			System.out.print((char)output);
			output = fileReader.read();
		}
		
		//BufferedWriter
		File file7 = new File("E:\\Zoho\\File Handling\\test\\test2.txt");
		FileWriter fwriter = new FileWriter(file7);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		bwriter.write("1212232");
		bwriter.newLine();
		bwriter.write("sakthi");
		bwriter.newLine();
		bwriter.write('A');
		bwriter.newLine();

		bwriter.flush();
		bwriter.close();
		
		FileReader freader = new FileReader(file7);
		BufferedReader breader = new BufferedReader(freader);
		String line = breader.readLine();
		while(line!=null){
			System.out.println(line);
			line = breader.readLine();
		}
		
	}
} 