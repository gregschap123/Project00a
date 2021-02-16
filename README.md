# Project00a

This is learning the GitHub workflow try 2.

Each team will have one member fork the gregschap123/Project00a repository into their local account.
That team member will need to add the other team members as collaborators:
- Goto settings -> Member Access
- enter GitHub password if/when prompted
- enter the email address that each team member used to create their GitHub account.
- each team member will be sent an email at that address. They need to find the email and accept the invitation to collaborate

Now each team member can clone the fork onto their local machine.
- choose green Code dropdown and copy the URL of the forked repository
- make a local folder on your machine to put the repository. Open a terminal window in that folder.
- execute: git clone <Paste the URL here>
  
DO NOT TRY TO USE INTELLIJ TO OPEN THE PROJECT IN THE LOCAL REPOSITORY. THE LOCAL REPOSITORY IS USED ONLY TO UPLOAD (PUSH) FILES AND DOWNLOAD (PULL) FILES
TO AND FROM THE GITHUB REPOSITORY. 
DO NOT ADD ANY SUB FOLDERS IN THE LOCAL REPOSITORY. THE ONLY FILES THAT WILL EVER BE IN THE REPOSITORY ARE .md AND .java FILES.

Use Finder to navigate out of the repository folder and create a new folder to use for development. REMEMBER THAT THIS NEW FOLDER MUST NOT BE A SUB 
FOLDER OF THE REPOSITORY!

In this new development directory create a folder named src. Copy the files from the repository into the src folder. Now open the project using 
Intellij. You should be able to run the program and see the names of 2 teams and their team members printed out.

Each team member in a strictly sequential order will perform the following tasks
1. The owner of the forked repository will modify the code to add the team (Team1, Team2, etc) to the course. 
2. The owner of the forked repository will modify the code to add their name to the team. Test the program to see that the output includes
    your new team name and your name printed in the style of the existing teams.
3. Copy the files you modified to your local repository. Open a terminal window in the repository folder.
4. Execute for each modified file: git add <filename of modified file>
5: Execute: git commit -m "First Commit"
6: Execute: git push
 
This set of steps shouls update the GitHub repository with the new code. Look at the code in the GitHub repository to verify this.

Now the rest of the team members will one at a time ...
1. execute: git pull
This will download the new code to your repository.
2. Use finder to navigate out of the local repostory and create a new folder just for development.
3. Create a folder named src in your development folder.
4. Copy the .java files from the repository folder to your src folder.
5. Open the development folder in Intellij so that you can run and modify the project files.
6. Add code to have your name printed out as part of your team.
7. copy the modified files to the local repository. Open a terminal in the local repository
8. execute: for every modified file: git add <filename.java>
9. execute: git commit -m "Second Commit"
10. execute: git push
This will update the GitHub repository with your new code.
Now the next team member goes to step 1 and repeats the workflow.

After all team members have completed their task, everyone should do a git pull to download the finished project. Copy the .java files to your src development 
folder. Open and test the program to assure that it works correctly. If not then the appropriate team member should fix it by following the above workflow.

Once the project is working, the owner of the forked repository on GitHub will issue a pull request to gregshap123.

If you did your job correctly, I should be able to merge your code into the original repository easily.
