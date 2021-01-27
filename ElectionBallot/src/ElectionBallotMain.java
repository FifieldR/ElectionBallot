import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**@author rfifield
 * History
 * Jan 27, 2021 Started
 * 
 */
public class ElectionBallotMain {

	public static void main(String[] args) {
		//Vars
		Scanner inputFile = new Scanner(System.in);
		String file = "";
		File canFile = null;
		Scanner fileReader = null;
		String lineData = "";
		//Asks for file location
		System.out.println("Input a File path");
		file = inputFile.nextLine();
		System.out.println("Trying: " + file);
		
		//Tries file reader
		canFile = new File(file);
		try {
			fileReader = new Scanner(canFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//Read File
		ArrayList<Candidate> canList = new ArrayList<Candidate>();
		if (fileReader != null) {
			fileReader.nextLine();
			while (fileReader.hasNextLine()) {
				lineData = fileReader.nextLine();
				String[] splitLine = lineData.split(",");
				canList.add(new Candidate(splitLine[0], splitLine[1], splitLine[2]));
			}
			//Prints ballot
			System.out.printf("%-10s %-10s %-10s %-10s\n", "First name", "Last Name", "Grade", "Your Vote");
			for (int i = 0; i < canList.size(); i++) {
				System.out.printf("%-10s %-10s %-10s [_]\n", canList.get(i).getFirstName(), canList.get(i).getLastName(), canList.get(i).getGrade());
			}
			
		}
		
	}

}
// C:\Users\rfifield\OneDrive - Shawsheen Valley Technical High School\2020-2021\Programming\Eclipse\ElectionBallot\Misc\candidates.csv