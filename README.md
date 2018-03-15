# tripactions-springboot-tests

This is the demo repo to show how to test TripActions site - https://tripactions.com - from springboot framework

To build the tests use the following command:
    mvn clean package
After completing above command you should have all executable code created under "target" foder
Verify that the file "demo-0.0.1-SNAPSHOT.jar" was created successfully.
    
To start testing TripActions site from java do:
    java -jar target\demo-0.0.1-SNAPSHOT.jar
This will perform TripActions tests under springboot frammework

To start testing TripActions site from maven do:
	mvn test
This will integrate above TripActions tests with JUnit and maven-surefire-plugin.
After executing above command you will be to see the generated tests reports.
    
