param()

Write-Host "About to create the initial commit for the project import."
$answer = Read-Host "Proceed and create commit 'Initial project import'? (Y/N)"
if ($answer -notin @('Y','y','Yes','yes')) {
    Write-Host "Aborted by user. No commit created."
    exit 1
}

if (-not (Test-Path .git)) {
    Write-Host "Initializing new git repository..."
    git init
    git branch -M main
}

Write-Host "Staging files..."
git add .

Write-Host "Committing..."
git commit -m "Initial project import"

Write-Host "Initial commit created locally. To push to GitHub run:"
Write-Host "  git remote add origin <your-repo-url>  # only if remote not set"
Write-Host "  git push -u origin main"
