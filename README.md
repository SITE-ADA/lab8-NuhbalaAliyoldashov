# University System (Imported Project)

## Project Overview

This repository contains the University System multi-module project (student-service and course-service). The project was imported as the initial baseline for WM2 – Lab8 tasks.

## Technologies

- Java 17
- Spring Boot
- Gradle
- H2 (dev) / PostgreSQL (production - optional)
- Swagger / OpenAPI

## How to run

1. Install Java 17 and Gradle (or use the included `gradlew`).
2. From the project root run:

```powershell
.\gradlew clean build
.\gradlew :student-service:bootRun
.\gradlew :course-service:bootRun
```

By default services run on separate ports (see each module `application.yml`).

## Start databases / services

- For local development the project uses an embedded H2 database by default.
- To use PostgreSQL, start a Postgres instance and configure connection details in each module's `application.yml`.
- Example using Docker Compose (if present):

```powershell
docker-compose up -d
```

## Testing the API endpoints

- After services run, open Swagger UI (see Swagger URL below) to explore and test endpoints.
- Use `curl` or Postman for example requests (examples below).

## Swagger URL

- Swagger UI is available at: `http://localhost:8080/swagger-ui.html` (or module-specific ports)

## Example requests

- Get all students:

```bash
curl http://localhost:8080/api/students
```

- Enroll student (example):

```bash
curl -X POST http://localhost:8080/api/enrollments -H "Content-Type: application/json" -d '{"studentId":1,"courseId":2}'
```

## Important notes

- This repository was prepared for incremental commits per lab instructions. I will create small, meaningful commits for each required feature (README, enrollment date, prerequisite validation, retrieval by student name, and Azerbaijani Swagger descriptions). Commit messages will be in English.
- To push commits to GitHub run `git push origin main` after each commit (or the branch you use).

