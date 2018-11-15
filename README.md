# testng

## This is a TestNG Repository

## Setup

* Clone the repo
* Install dependencies `mvn compile`
* Update `*.conf.json` files inside the `src/test/resources/conf` directory with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)

## Running your tests

- To run a single test, run `mvn test -P single`
- To run local tests, run `mvn test -P local`
- To run parallel tests, run `mvn test -P parallel`

