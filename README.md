# README - QA Testing Assignment

## Candidate Name : ABIRAMI D

## Tools and Frameworks Used

**Task 1 — Manual Testing**
- Microsoft Excel — for documenting manual test cases for Claude.ai

**Task 2 — Automation Testing**
- Java (JDK 8+)
- Selenium WebDriver
- Maven — build and dependency management
- IntelliJ IDEA — IDE used to run the tests
- Sauce Demo website (https://www.saucedemo.com) — application under test

**Task 3 — Performance / Load Testing**
- Postman — API collection and test run management
- ReqRes API (https://reqres.in) — target API for load testing

---

## Tasks Completed

- **Task 1 — Manual Test Cases for Claude.ai**
  - Designed and documented functional test cases covering core Claude.ai features
  - Saved as `claude_testcases.xlsx` covering positive, negative, and edge scenarios

- **Task 2 — Automation Testing for Sauce Demo Website**
  - **Flow 1 — Valid Login and Checkout:** End-to-end test covering login, adding items to cart, and completing checkout (`SauceDemoCheckoutTest`)
  - **Flow 2 — Locked User Login:** Verifies that a locked-out user cannot log in and receives the correct error message (`LockedUserLogin`)

- **Task 3 — Performance Testing using ReqRes API**
  - Load tests executed against the ReqRes REST API via Postman
  - Collection file: `My Collection.postman_collection`
  - Test run results: `My Collection.postman_test_run`
  - Summary findings documented in `load_test_report.md`

---

## How to Run Automation Tests

### Pre-requisites

- Install **Java JDK 8 or above** and set `JAVA_HOME` environment variable
- Install **Apache Maven** and set `MAVEN_HOME`, add to `PATH`
- Install **IntelliJ IDEA**
- Ensure **Google Chrome** is installed

### Setup Steps

1. Open IntelliJ IDEA
2. Click **File → Open** and navigate to:
   ```
   qa-testing-assignment/Task2/sauce_demo_automation
   ```
3. IntelliJ will detect the `pom.xml` — click **Load Maven Project** if prompted
4. Wait for Maven to download all dependencies

### Execution Steps

**Flow 1 — Valid Login and Checkout**

1. In the Project panel, navigate to `src/test/java`
2. Locate the class `SauceDemoCheckoutTest`
3. Right-click the class → select **Run 'SauceDemoCheckoutTest'**
4. The test will open Chrome, log in with valid credentials, add an item to the cart, and complete checkout

**Flow 2 — Locked User Login**

1. In the Project panel, navigate to `src/test/java`
2. Locate the class `LockedUserLogin`
3. Right-click the class → select **Run 'LockedUserLogin'**
4. The test will attempt to log in with the locked user credentials and verify the error message is displayed

> Test results are shown in the IntelliJ **Run** panel at the bottom of the screen.

---

## How to Run Load Tests

### Using Postman

1. Install **Postman** from https://www.postman.com/downloads/
2. Open Postman and click **Import**
3. Import the collection file:
   ```
   qa-testing-assignment/Task3/My Collection.postman_collection
   ```
4. To view saved results, also import:
   ```
   qa-testing-assignment/Task3/My Collection.postman_test_run
   ```
5. Click **Run Collection** to execute the API tests


