# BridgeLabz-User-Registration-Problem

## 19/10/2026 Task

Week 4: Java Collections and Streams

Day 6: JUnit Testing
Hi Team,
Complete the assigned use-case-based assignment and push your code to GitHub by following the repository structure and branching strategy outlined below.
Project Setup and GitHub Instructions:
- Create a Separate Project: Create a new Maven or Java project specifically for this assignment. This must be a separate project with its own GitHub repository.
- Main Branch: Keep only the README.md file in the main branch. The README should contain an overview of your project, its objectives, and the use cases covered.
- Develop Branch: Keep the initial project structure in the develop branch. The project structure should be empty, ready for implementation.
- Feature Branches: Create a separate feature branch for each use case. Complete the implementation and testing of each use case in its respective feature branch.
- Merge Changes: Once a use case is completed and tested successfully, merge its feature branch into the develop branch.
- Repeat for Every Use Case: Follow the same process for all use cases. Each use case must have its own feature branch.
Important: Maintain the same repository structure and branching strategy that we follow in the main repository. Ensure that your code is properly tested using JUnit and all completed work is pushed to GitHub.

## User Registration Problem:
The User Registration PDF lists these use cases:
- UC1–UC2: Validate first and last names: each must start with a capital letter and have at least three characters.
- UC3: Validate emails using the required format. The PDF gives abc.xyz@bl.co.in as an example, with three mandatory parts and two optional parts.
- UC4: Validate a mobile number in the format of country code, a space, and a 10-digit number—for example, 91 9919819801.
- UC5–UC8: Validate a password with at least eight characters, at least one uppercase letter, at least one digit, and exactly one special character.
- UC9: Test the email validator against the separately provided email samples.
- UC10: Write happy and sad JUnit test cases for the first name, last name, email, mobile number, and password validations.
- UC11: Write a parameterized JUnit test for multiple email entries.
