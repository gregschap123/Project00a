package Project00a;

import java.util.*;

public class Team1 extends Team {
    public Team1(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new Project00a.TeamMember("Mark Morykan"));
        members.add(new Project00a.TeamMember("Richie Glennon"));
        members.add(new Project00a.TeamMember("Kyle Schaedler"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
