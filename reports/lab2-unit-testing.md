# Lab 2 - Unit Testing & Coverage Report

## 1. Coverage Screenshot
*(Ensure the corresponding image is saved in the repository, for example as `coverage-result.png`)*

![Coverage Result](./coverage-result.png)

## 2. Interpretation of Results
Our unit test suite achieves very good results for the `Rating` logic class:
* **Line Coverage: 100%** (All lines of code in our algorithm were executed at least once by our tests).
* **Branch Coverage: 92%** (Almost all logical paths and `if` conditions were validated).

[cite_start]**What this coverage helps with:** It allows us to confirm there is no "dead code" and that our exception paths (negative scores or scores over 100) are executed correctly [cite: 865-866].

[cite_start]**What this coverage does NOT prove:** As discussed in class, coverage close to 100% does not prove the software is perfect[cite: 861]. [cite_start]It does not guarantee that the requirements are correct, that usability is good, or that the test data used is relevant [cite: 863-871]. 

## 3. Missing Test Idea
Although our line coverage is 100%, our branch coverage is 92%. One of the combined logical conditions (in our `if` statement with the `||` operator) was not covered in all its possible variations.

**Possible missing test:** We haven't explicitly tested the other intermediate grade boundaries. An interesting missing test would be to verify the exact boundaries for grades C and D (e.g., check what happens exactly at `77` points or `69` points) to ensure there are no comparison errors (`>` instead of `>=`). Furthermore, if we were to switch from a primitive `int` to an `Integer` object in the future, we would be missing a test to verify the application's behavior if the passed value is `null`.