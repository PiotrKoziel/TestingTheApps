$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("atmtest/atmTest.feature");
formatter.feature({
  "line": 3,
  "name": "Withdraw money from a cash machine",
  "description": "",
  "id": "withdraw-money-from-a-cash-machine",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@atm"
    }
  ]
});
formatter.before({
  "duration": 273758,
  "status": "passed"
});
formatter.before({
  "duration": 587233,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Withdrawing more money than actually is located on bank account",
  "description": "",
  "id": "withdraw-money-from-a-cash-machine;withdrawing-more-money-than-actually-is-located-on-bank-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Account balance of 200 eur",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User tries to withdraw 300 eur",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Account balance remains the same and equals 200 eur",
  "keyword": "Then "
});
formatter.match({
  "location": "atmTestSteps.accountBalance()"
});
formatter.result({
  "duration": 296549591,
  "status": "passed"
});
formatter.match({
  "location": "atmTestSteps.userWithdrawsAmountMoney()"
});
formatter.result({
  "duration": 1147015,
  "status": "passed"
});
formatter.match({
  "location": "atmTestSteps.verifyBalanceAccount()"
});
formatter.result({
  "duration": 768387,
  "status": "passed"
});
formatter.after({
  "duration": 424099,
  "status": "passed"
});
formatter.after({
  "duration": 2154297,
  "status": "passed"
});
});