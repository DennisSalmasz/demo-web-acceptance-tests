# Zilch assignment

- Created using Java Serenity BDD framework for UI tasks
- Lean Page Object Model with action classes is implemented enabling good framework maintainability and execution performance.
- Configured with Chrome and can be extended to other supported browsers.

## Prerequisites and limitations

- Maven version 3 or above and JDK version 8 or above 

### Environment-specific configurations and other default config
Application's environments are configured in `test/resources/serenity.conf` file

## Executing the tests

Ensure you are in the project root directory and run the following command from the command line.

To execute all UI tests
```
$ mvn clean verify
```

To execute specified UI tests
```
$ mvn clean verify -Dcucumber.filter.tags="@uitests"
```

Screenshots are by default enabled only for test failures to improve execution speed, to enable screenshots for each step during the tests, the following command line parameter need to be passed.
```
$ mvn clean verify -Dserenity.take.screenshots=FOR_EACH_ACTION
```

Once executed the test results will be stored in this path `target/site/serenity/index.html`

Run the following command from project root directory to view the results after execution.
```
$ open target/site/serenity/index.html
```

