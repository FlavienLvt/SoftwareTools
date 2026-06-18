# Project Selection

## Project name
[cite_start]Demo Web Shop [cite: 431, 917]

## Project URL
[cite_start]Lorem Ipsum [cite: 918]

## Application type
[cite_start]Web [cite: 920] [cite_start]*(Note: As identified in our risks, we might need to pair this with a public API sandbox like JSONPlaceholder or Restful Booker for Lab 6 if no internal API is accessible [cite: 901-905, 911]).*

## Main functionality
[cite_start]A realistic demo e-commerce platform that allows users to browse product categories, manage a shopping cart, and simulate the checkout process[cite: 432, 921].

## Features selected for testing
1. [cite_start]User Authentication (Registration, login, and password recovery) [cite: 436, 923]
2. [cite_start]Shopping Cart Management (Adding, updating, and removing items) [cite: 435, 924]
3. [cite_start]Customer Address Book (Adding, editing, and deleting addresses) [cite: 925]
4. [cite_start]Product Search (Searching by keywords and filtering) [cite: 434, 926]
5. [cite_start]Checkout Process (Billing, shipping, and confirming orders) [cite: 437, 927]

## Manual testing possibilities
The application is highly suitable for manual testing. [cite_start]We can design test cases for various user flows (both registered and unregistered users), boundary value analysis on registration/address forms, and exploratory testing on the cart and checkout mechanics[cite: 897, 928].

## Automation possibilities
* [cite_start]**Selenium:** Ideal for automating the main UI flows such as the checkout process, login, and dynamic cart updates[cite: 898, 929].
* [cite_start]**Robot Framework:** Can be used to write keyword-driven acceptance tests for our selected features (e.g., `Given user is logged in`, `When user adds item to cart`, `Then cart count increases`)[cite: 899, 929].
* [cite_start]**Postman:** To be determined based on hidden endpoint discovery, or we will use an external API sandbox for this specific requirement[cite: 905, 929].

## Risks
* [cite_start]**App changes during semester:** UI updates might break automated scripts and locators[cite: 441, 930].
* **Test data management:** Continuous creation of accounts and addresses could cause conflicts.
* [cite_start]**Dynamic UI elements:** Flaky Selenium scripts due to loading times[cite: 442, 930].
* [cite_start]**No public API available:** Might impact our ability to execute standard API testing[cite: 442, 930].