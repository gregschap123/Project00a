package Project00a;

import java.util.*;
import Project00a.Team;
import Project00a.Member;
import Project00a.TeamMember;


public class Team4 extends Team
{
    public Team4(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Justin Szaro"));

        // create a new member class for each team member
        // and add it to the team members list
    }
}
