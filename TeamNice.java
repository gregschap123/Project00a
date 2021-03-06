package Project00a;

import java.util.*;
import Project00a.Team;
import Project00a.Member;
import Project00a.TeamMember;


public class TeamNice extends Team
{
    public TeamNice(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("John James"));
        members.add(new TeamMember("Betty Rubble"));
        members.add(new TeamMember("Fred Flintstone"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}

