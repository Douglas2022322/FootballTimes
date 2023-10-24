/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballtimes;

import java.util.List;

/**
 *
 * @author dougl
 */
class Team {
    private String teamName;
    private List<Person> members;

    public Team(String name, List<Person> members) {
        this.teamName = name;
        this.members = members;
    }

    public String getName() {
        return teamName;
    }

    public List<Person> getMembers() {
        return members;
    }
    
    
}

