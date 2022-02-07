#### Personal Project - Spring 2022
# Budget Helper
## Due Date: TBD

*Honestly just for fun and will probably keep working on it later for no reason at all*

### Files
* README.md
    * this project description
* main.java
    * main project file
* test_input.txt
    * the test file I will be using as input in the case that a new file is not being made
* notes.txt
    * back up in case something's lost or I mess up and need to back track without committing

### Helpful Links
* [Google](https://www.google.com)
    * For searching problems

### Things to remember
:warning: **_Provided By My 110 Professor For My First Lab_** :warning:
## Writing the Code
The next thing we are going to do is learn how to work with git and github.
First, let's set up our git credentials. Enter the following two commands in the terminal:

`git config --global user.name "Firstname Lastname"`

`git config --global user.email "email@binghamton.edu"`

:warning: **Replace `Firstname Lastname` and `email@binghamton.edu` with your information**

You should be in your [chosen] directory.

### Github
You will need a Github account to submit your labs. You will also use your Github account any time you need help with your code. If you do not already have one, you can go to [Github](https://github.com) and sign up.

Be sure you are still in the [chosen] directory and execute the following command in the terminal:

`git clone URL`

:bulb: *where URL is the copied text ending in ".git".*

We will explore git workflows in-depth later in this lab.

Now that we have our repository set up, we will edit the code. Change your directory to the cloned repository. If you aren't sure how to do this, first review part A, and try to figure it out. As a last resort, ask for help.

If you are not already familiar with a linux editor, please use gedit, which has several nice features for Python code development.

:warning: Beware that gedit is a linux editor, and will not work on other OS's (Windows, Mac, etc.).

You can use gedit to open a file by typing, for example, the following into a linux command shell:

`gedit <filename>.<type> &`

If there is no file in the current folder named *lab1.py*, then gedit will create a new empty one for you (remember, you can check your current folder location with `pwd`). If the file does exist, it will edit the existing file. If you cloned the git repository correctly, you should have a `<filename>.<type>` file with the following contents:

```python
def main():
    print("Hello World")
main()
```

:bulb: The ampersand at the end of the command says to run this application in the background. This will allows you to write some code, save it, then run it in the shell without quitting gedit.

After making changes to a file, you can save it by clicking "Save" at the top of the gedit window, or with the hot key command `<ctrl-s>`. Note that if you have made changes to an open file, and those changes have not been saved, the file name across the top of the window will be preceded by an asterisk (for example, "\*lab1.py"). To exit from gedit, make sure your modifications are saved, and then type `<ctrl-q>` in the gedit window, or simply close the gedit window by clicking the “x” in the upper right hand corner.

### Git

In this and future labs, we will use Github Classroom repositories. You have already [forked](https://help.github.com/articles/fork-a-repo/) this repository when you accepted the emailed link. That makes a copy of the repository, free for you to make changes. Then you cloned your forked repository to get a working copy onto this machine.

Now that we have made local changes to our working copy, let's [commit](https://git-scm.com/docs/git-commit) those changes to the repository:

:warning: *These commands all presume that your current working directory is within the directory tracked by `git`.*

```shell
git commit -a -m "first commit"
```

The `-a` says that git should add all tracked files with changes to your commit, and the `-m` says the next string contains the commit message, which is required by git any time you make a commit.

What about _untracked files_? Remember the commands.txt file you created earlier? You are going to have to move it into your working folder, and add it to the repository. I am assuming you created the file in the parent directory. If you created it somewhere else, you will need to adjust the following commands accordingly.

Run the following commands:

```shell
cd ..
mv commands.txt <repo folder>
cd <repo folder>
git status
```
:warning: You should replace <repo folder> with the name of your folder.

You'll notice that `git` tells us that `commands.txt` is an _untracked file_. That means it's not being tracked by the repository. Let's fix that by [adding](https://git-scm.com/docs/git-add) it.

```shell
git add commands.txt
git commit -a -m "Added commands.txt file"
```
:warning: *You* __must__ *add any new files you create to the repository with the `git add` command or they will not upload to the repo, and your code will not work.*

Once we've made the commits for a given coding session, we need to add those to the repository by performing a [push](https://git-scm.com/docs/git-push):

```shell
git push
```

Lastly, the next time we begin a coding session, we will need to [pull](https://git-scm.com/docs/git-pull) to ensure we have the most updated working copy.

```shell
git pull
```
:bulb: You should get a message that you are already up to date.

This will allow you to keep your code in the lab and on your own computer synchronized if you want to work outside of lab.

Lastly we are going to make our final commit. You will need to do this when your submission is ready for grading.

```shell
git commit -a -m "final commit message"
git push
```

:bulb: You may get a message that there have not been any changes. That's okay, that just means you have already *saved* all changes.

You can commit as often as you like, and revert your code to any previous commit using the **commit hash**. The commit hash is a long number that identifies a specific version of your code. I recommending making commits often with a comment describing the state of your code. To find your most recent commit hash, use the following command:

```shell
git rev-parse HEAD
```    
You should get a long, strange looking number:
```
35e27598324d8b4d7ddeb4d7aa8abe91c6263705
```

To complete your submission, you must copy and paste this number into mycourses. Go to MyCourses, select CS110, and **Assignment Hash Submission**. Select Lab 1, and where it says text submission, paste your commit hash. The TAs will only grade your submission that corresponds to the hash you submitted. You can update this as often as you like until the deadline.

I strongly recommend making a submission early on, even if your assignment is not 100% working, to avoid late penalties.

:warning: You __MUST__ submit the commit hash on mycourses before the deadline to be considered on time **even if your lab is completely working before the deadline**. :warning:

That's it! We've completed our work for this lab. We will use this submission process for all subsequent labs and assignments.

:bulb: Useful `git` references:
- https://guides.github.com/introduction/flow/
- https://help.github.com
- https://git-scm.com/doc
