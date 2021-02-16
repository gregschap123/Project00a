package Project00a;

import java.util.ArrayList;
import Project00a.TeamCool;
import Project00a.Member;

public class Course
{
    ArrayList<Team> teams = new ArrayList<>();

    public Course()
    {

    }


    public void printCourseMembers()
    {
        for(int i = 0; i < teams.size(); i++)
        {
            System.out.println(teams.get(i).getTeamName());
            teams.get(i).printTeamMembers();
            System.out.println("\n");
        }
    }


    public void createTeams()
    {
        teams.add(new TeamCool("TeamCool"));
        teams.add(new TeamNice("TeamNice"));
        teams.add(new Team5("Team5"));
        teams.add(new Team03("Team03"));
        teams.add(new Team02("Team02"));
        teams.add(new Team1("Team1"));


        // create each new team and add to team list;
        // Repository owner will do this.
    }

}

