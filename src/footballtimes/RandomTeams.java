/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballtimes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Douglas Vinicius Dierings
 * @param people The list of people to form teams from.
 * Generate random teams based on a list of people.
 */
public class RandomTeams {

    public List generateTeams(List people) {
        // Define an array of team names
        String teamNames[] = {
            "Flamengo",
            "Palmeiras",
            "São Paulo FC",
            "Santos",
            "Corinthians",
            "Fluminense",
            "Cruzeiro",
            "Vasco da Gama",
            "Grêmio",
            "Internacional",
            "Botafogo",
            "Atlético Mineiro",
            "Bahia",
            "Sport Recife",
            "Coritiba",
            "Athletico Paranaense",
            "Chapecoense",
            "Goiás",
            "Vitória",
            "Fortaleza"};

        // Copy the list of people to a local list and shuffle it (it is a easy way to randomize the list in my opinion)
        List peopleList = people;
        Collections.shuffle(peopleList);

        // Generate 20 teams, each with 5 random members
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            List<Person> teamMembers = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                // Remove a person from the shuffled list and add them to the team
                Person person = (Person) people.remove(0);
                teamMembers.add(person);

            }
            // Create a Team object and add it to the list of teams with the name of the team
            teams.add(new Team(teamNames[i], teamMembers));
        }
        return teams;
    }

}
