# csoftz-poc-codacy

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/cd52f80f9b664b94a42ea5793b17f212)](https://app.codacy.com/gh/cortizqgithub/csoftz-poc-codacy?utm_source=github.com&utm_medium=referral&utm_content=cortizqgithub/csoftz-poc-codacy&utm_campaign=Badge_Grade_Settings)

Java project to assess the Codacy tool offering. http://codacy.com


export CODACY_PROJECT_TOKEN=<your project API token>
bash <(curl -Ls https://coverage.codacy.com/get.sh) report -r report.xml
bash <(curl -Ls https://coverage.codacy.com/get.sh) report -r report.xml
For Java Codacy Coverage it is required to use JaCoco https://www.eclemma.org/jacoco/

References
Adding coverage to your repository
https://docs.codacy.com/coverage-reporter/#generating-coverage

##  Versions

Spring Boot 2.5.3
Spring Framework 5.3.9

Maven Plugins
JaCoCo 0.8.7