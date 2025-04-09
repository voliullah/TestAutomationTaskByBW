# Katalon Studio Automation – Magento Demo Site

This Katalon Studio test automation project was completed by Waliullah. The task was assigned to me by BeetleWare.

## Overview

This project includes automated UI test cases for the Magento demo website:  
https://magento.softwaretestingboard.com/

### Scenarios Covered:

1. Register a new user and log in  
2. Log in, navigate to Men's > Jackets, add the second item to cart  
3. Checkout the cart  
4. Search for "Nike" and assert search results  

Each test case is implemented with reusable test objects using Katalon’s Object Repository and structured for maintainability.

## How to Run the Tests

1. Open Katalon Studio  
2. In the Test Suites folder, open the suite collection named All Scenarios in Parallel  
3. Set Execution Mode to Parallel  
4. Select Chrome as the browser  
5. Click the Execute button (the blue play button in the toolbar)

Each scenario will run in parallel in its own browser instance.

## Notes

- The tests are independent and do not rely on shared state.  
- After execution, results and logs can be found in the Reports folder.


