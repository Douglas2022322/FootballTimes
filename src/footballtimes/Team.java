/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballtimes;

import java.util.List;

/**
 * @author Douglas Vinicius Dierings Represents a team with a team name and a
 * list of team members.
 */
class Team {

    private String teamName;
    private List<Person> members;

    // Constructor
    public Team(String name, List<Person> members) {
        this.teamName = name;
        this.members = members;
    }

    // Getter for the team name
    public String getName() {
        return teamName;
    }

    // Getter for the list of team members
    public List<Person> getMembers() {
        return members;
    }

}
