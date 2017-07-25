#!/bin/bash

cd /opt/Hygieia-jars

start java -jar api.jar --spring.config.location=dashboardApi.properties 

start java -jar github-scm-collector-2.0.5-SNAPSHOT.jar --spring.config.location=dashboardApi.properties 

start java -jar jenkins-build-collector-2.0.5-SNAPSHOT.jar --spring.config.location=dashboardApi.properties 

start /opt/gulpserve.sh &

