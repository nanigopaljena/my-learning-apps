# Getting Started

### Reference Documentation

### This app is a sample app to start quickly with spring boot and cucumber test cases

* This app is a simple spring boot app which hosts one API on default(8080) port
* It has only one get API (/test-app) which returns a String
* It has actuator(health endpoint)
* This app contains cucumber test cases
* The feature files can be ru independently, or it can be run from the Runner file
* For this app CI/CD is also implemented
* When the Pipeline is run it will upload the reports to the artifact which can be downloaded
* The pipeline will run the spring boot app then the cucumber automation for a tag provided as input in the workflow

