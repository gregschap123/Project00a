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
        members.add(new Project00.TeamMember("Mark Morykan"));
        members.add(new Project00.TeamMember("Janice Jones"));
        members.add(new Project00.TeamMember("Harold Hero"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
