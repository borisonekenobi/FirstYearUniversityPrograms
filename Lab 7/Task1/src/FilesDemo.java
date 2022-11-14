import java.io.FileNotFoundException;

public class FilesDemo {
	public static void main (String[] args) throws FileNotFoundException { // main method that can throw a FileNotFoundException
		String fileName = "lines.txt"; // String variable that stores the name of the file

		FileSave fileSave = new FileSave(fileName); // FileSave variable that will create the file
		fileSave.save("""
				1-Lorem ipsum dolor sit amet
				2-Consectetuer adipiscing elit
				3-Sed diam nonummy nibh euismod tincidunt
				4-Ut wisi enim ad minim veniam
				5-Quis nostrud exerci tation ullamcorper
				6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat
				7-Duis autem vel eum iriure dolor in hendrerit
				8-Vel illum dolore eu feugiat nulla facilisis at vero eros"""); // save the block of text to the file

		FileDisplay fileDisplay = new FileDisplay(fileName); // FileDisplay variable that will display the variable
		fileDisplay.display(); // display the entire file
		fileDisplay.display(3); // display the first 3 lines of the file
		fileDisplay.display(10); // display the first 10 lines of the file
		fileDisplay.display(3, 5); // display lines 3 to 5 of the file
	}
}
