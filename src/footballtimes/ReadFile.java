/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballtimes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Douglas Vinicius Dierings
 * This class is responsible for reading data from a CSV file and creating a list of Person objects.
 */
public class ReadFile {
    //Constructor
    public List ReadFile() {
        List<Person> people = new ArrayList<>();
        try {
            // Define the path to the CSV file (it is final so it can be changed)
            final String locationFile = "MOCK_DATA.csv";
            // Open and read the CSV file
            BufferedReader reader = new BufferedReader(new FileReader(locationFile));
            //Stores one line of the file witch are the all info for one person
            String line;

            while ((line = reader.readLine()) != null) {
                // Parse the data and create Person objects
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                people.add(new Person(id, firstName, lastName, email));
            }

        } catch (Exception e) {
            System.out.println("File access error!");
        }
        //Return a list of the people in the file
        return people;
    }

}
