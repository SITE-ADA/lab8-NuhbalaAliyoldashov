Write-Host "About to create commit for Part 2: Enrollment date, prerequisite check, and student-name search."
$answer = Read-Host "Proceed and create commit 'Add enrollment date, prerequisite validation, and student-name search'? (Y/N)"
if ($answer -notin @('Y','y','Yes','yes')) {
    Write-Host "Aborted by user. No commit created."
    exit 1
}

if (-not (Test-Path .git)) {
    Write-Host "Initializing new git repository..."
    git init
    git branch -M main
}

# Stage changed files (pattern)
git add -A

git commit -m "Add enrollment date, prerequisite validation, and student-name search"

Write-Host "Commit created locally. To push to GitHub run:"
Write-Host "  git remote add origin <your-repo-url>  # only if remote not set"
Write-Host "  git push -u origin main"
