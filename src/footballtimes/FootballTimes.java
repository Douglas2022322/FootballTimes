/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballtimes;

import java.util.List;

/**
 * GitHub Link: https://github.com/Douglas2022322/FootballTimes
 * @author Douglas Vinicius Dierings
 */
public class FootballTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create an instance of the ReadFile class to read data from a file
        ReadFile data = new ReadFile();

        // Create an instance of the RandomTeams class
        RandomTeams team = new RandomTeams();

        // Generate teams and retrieve the list of generated teams
        List<Team> generatedTeams = team.generateTeams(data.ReadFile());

        // Iterate through the generated teams and their members, then print the information
        for (Team t : generatedTeams) {
            System.out.println("Team Name: " + t.getName());
            for (Person person : t.getMembers()) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
            System.out.println();

        }
    }
}
