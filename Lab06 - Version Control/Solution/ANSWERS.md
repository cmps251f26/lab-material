# Lab06 – Version Control: Walkthrough

This lab has no Java code. The steps below are the expected workflow, done from the terminal. GitHub Desktop and Eclipse (EGit) do the same steps through buttons.

## 1. One-time setup

```bash
git --version                                   # check Git is installed
git config --global user.name  "Your Name"
git config --global user.email "ab1234567@student.qu.edu.qa"
```

Use the same email as your GitHub account, so your commits are linked to you.

## 2. Individual repository

```bash
git clone https://github.com/<org>/<your-repo>.git
cd <your-repo>

# ... create or edit files, e.g. copy your Lab05 project here ...

git status                       # see what changed
git add .                        # stage everything (or: git add <file>)
git commit -m "Add Lab05 Circle and Rectangle exercises"
git push                         # send your commits to GitHub
```

Repeat `add → commit → push` every time you finish a piece of work. Don't wait until the deadline.

## 3. Team repository (project groups B01-G01 … B01-G07)

Everyone in the group works on the same repo, so **always get the latest changes before you start**:

```bash
git clone https://github.com/cmps251f26/B01-G0X.git   # once
cd B01-G0X

git pull                         # = git fetch + merge; do this before every work session
# ... work ...
git add .
git commit -m "Implement Book.addChapter"
git push
```

If `git push` is rejected because a teammate pushed first, run `git pull`, fix any conflicts, commit, then push again.

### Resolving a merge conflict

```
<<<<<<< HEAD
your version
=======
teammate's version
>>>>>>> origin/main
```

Edit the file so it holds the correct final code and delete the markers. Then:

```bash
git add <file>
git commit
git push
```

## 4. Commands worth knowing

| Command | Purpose |
|---|---|
| `git log --oneline` | Commit history |
| `git diff` | Unstaged changes |
| `git restore <file>` | Throw away local changes to a file |
| `git branch feature-x` / `git checkout feature-x` | Work on a separate branch |
| `git merge feature-x` | Bring a branch back into the current one |
| `git stash` / `git stash pop` | Put changes aside temporarily |

## 5. Good commit messages

- Write them in the imperative and keep them specific: `Fix withdraw allowing negative balance`, not `update` or `final version 2`.
- One logical change per commit.
- Never commit `bin/`, `.class` files, or passwords.
