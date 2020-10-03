
Official Repository by **DSC CIET** for Hacktoberfest.

Get your free T-shirt with us ;)

# What is HacktoberFest
 Hacktoberfest is open to everyone in our global community. Whether you’re a developer, student learning to code, event host, or company of any size, you can help drive growth of open source and make positive contributions to an ever-growing community. All backgrounds and skill levels are encouraged to complete the challenge.

1. Hacktoberfest is a celebration open to everyone in our global community.
2. Pull requests can be made in any GitHub-hosted repositories/projects.
3. You can sign up anytime between October 1 and October 31.

# Rules / Steps
  * Commit your App files on your own Repositiory.
  * Create appName.md file and Add your app description and link to your repo in it.
  * Create a PR with description.

  # How to add App Files in your own repository
  1. Make a new repository by going to your github account and clicking on new Button.
  2. Give it a name and add README.md if you want and create it.
  3. Click on Code button in green and copy repository HTTPS link.
  4. Now go to your terminal(in case of MacOS or Linux) and to git command line(in case of Windows).
  **Link to download git in windows [Download here](https://git-scm.com/download/win).**
  5. Clone the repository using `git clone repository_link`.
  6. Now go your cloned folder and add your app project.
  7. Navigate to cloned project from command line using `cd source_of_cloned_project`.
  8. Come back to command line and use `git status` to check which files are unstaged or not added to commit.
  9. Use `git add source_for_filename` to stage files for commiting.
  **source_for_filename can be viewed using `git status`**
  10. Now after the files are staged we need to commit them. So use `git commit -m "your_commit_message"`.
  11. After your files are commited use `git push origin` to push to remote repository.
  **Here in this case remote repository will itself be setup, we dont need to add our repository as remote repository**

  # How to make create PR(Pull Request) in DSC-Chitkara Hacktoberfest repository

  
  1. Clone the repository using `git clone https://github.com/DSC-ChitkaraUniv/HacktoberFest-2020.git`.

  2. Now navigate to HacktoberFest cloned project using `cd source_of_hactoberfest_cloned_project`.

  3. Make a seperate branch and switch to it using `git checkout -b new_branch`.

  4. For Mobile Develeopment Category go under Mobile Development category from explorer/finder and add README.md file.

  5. README.md file shoud contain app name, it's description, App Logo or Screenshots(Optional), Name of Creator, Link to Github repository(one which we created in previous step).

  **For Hosting images for free use [IMGBB](https://imgbb.com/)**

  6. After adding these details save your file(s) and come back to command line. 

  7. Check status for files to be staged using `git status`.

  8. Now add files for  staging using `git add source_of_files`.

  **source_for_files can be viewed using `git status`**

  9. Now commit these files using `git commit -m "commit_message`.

  10. Use `git push --set upstream origin new_branch` to push changes to forked repository.

  11. Now go to your github account and you will see create pull request after navigating to forked repository.

  12. Click that and crete pull request.

# How to keep your local repository updated


1. Use `git remote -v` to check your remote repository. Output should look like
```
Output
origin  https://github.com/your-username/forked-repository.git (fetch)
origin  https://github.com/your-username/forked-repository.git (push)
```

2. Next, we’ll specify a new remote upstream repository for us to sync with the fork. Use `git remote add upstream https://github.com/original-owner-username/original-repository.git`.
**In this example, upstream is the shortname we have supplied for the remote repository since in terms of Git, “upstream” refers to the repository that we cloned from.**

3. Use `git remote -v`.
```
Output
origin  https://github.com/your-username/forked-repository.git (fetch)
origin  https://github.com/your-username/forked-repository.git (push)
upstream    https://github.com/original-owner-username/original-repository.git (fetch)
upstream    https://github.com/original-owner-username/original-repository.git (push)
```

4. To sync your fork use `git fetch upstream`.
```
Output
From https://github.com/original-owner-username/original-repository
 * [new branch]      master     -> upstream/master
 ```
 **Output may var depending on what and how much data is synced**

 5. Now, commits to the master branch will be stored in a local branch called upstream/master.Use `git checkout master` to switch to master.

 6. We’ll now merge any changes that were made in the original repository’s master branch, that we will access through our local upstream/master branch, with our local master branch.Use `git merge upstream/master`.


 **To directly pull changes from original repository to your local use `git pull upstream master`**


<div align="center">
<h1 align="center">Social Handle</h1>
  <a href="https://www.instagram.com/dsc_ciet/" target="_blank"><img src="https://img.icons8.com/fluent/48/000000/instagram-new.png"/></a>
  <a href="https://twitter.com/dscciet" target="_blank"><img src="https://img.icons8.com/fluent/48/000000/twitter.png"/></a>
  <a href="https://dsccietcommunity.slack.com/join/shared_invite/zt-ht5oy31g-Cj~Ib0AklnA9AZdlwCs8JA#/" target="_blank"><img src="https://img.icons8.com/color/50/000000/slack-new.png"/></a>
  <a href="https://www.facebook.com/Google-Developers-967415219957038/" target="_blank"><img src="https://img.icons8.com/fluent/48/000000/facebook-new.png"/></a>
  <a href="https://www.youtube.com/googledevelopers" target="_blank"><img src="https://img.icons8.com/color/48/000000/youtube-play.png"/></a>
  <a href="mailto: dscciet@gmail.com" target="_blank"><img src="https://img.icons8.com/fluent/48/000000/gmail.png"/></a>
  <a href="https://dsc.community.dev/chitkara-university-punjab/" target="_blank"><img src="../Images/dsc.png"/></a>

</div>
