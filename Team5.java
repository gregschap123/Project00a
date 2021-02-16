package Project00a;

import java.util.*;
import Project00a.Team;
import Project00a.Member;
import Project00a.TeamMember;

    public class Team5 extends Project00a.Team
    {
        public Team5(String name)
        {
            super(name);
            createTeamMembers();
        }

        public void createTeamMembers()
        {
            members.add(new Project00a.TeamMember("Evan Toyberg"));
            members.add(new Project00a.TeamMember("Haris Naveed"));
            members.add(new Project00a.TeamMember("Kyle Smilon"))


            // create a new member class for each team member
            // and add it to the team members list
        }
    }
