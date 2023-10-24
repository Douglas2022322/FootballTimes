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
 *
 * @author dougl
 */
public class ReadFile {

    public List ReadFile() {
        List<Person> people = new ArrayList<>();
        try {

            String locationFile = "C:\\Users\\dougl\\Documents\\NetBeansProjects\\FootballTimes\\MOCK_DATA.csv";
            BufferedReader reader = new BufferedReader(new FileReader(locationFile));
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
            System.out.println("Erro de acesso ao arquivo!");
        }
        return people;
    }

}
