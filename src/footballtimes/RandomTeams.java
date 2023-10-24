/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballtimes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dougl
 */
public class RandomTeams {

    public RandomTeams(List people) {
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

        List peopleList = people;
        Collections.shuffle(peopleList);

        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            List<Person> teamMembers = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Person person = (Person) people.remove(0);
                teamMembers.add(person);

            }
            teams.add(new Team(teamNames[i], teamMembers));
        }

        for (Team team : teams) {
            System.out.println("Team Name: " + team.getName());
            for (Person person : team.getMembers()) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
            System.out.println();
        }
    }

}
