#!/bin/bash

APP_DIR="/opt/hygieia"
java -jar ${APP_DIR}/api.jar --spring.config.location=${APP_DIR}/dashboardApi.properties &
java -jar ${APP_DIR}/github-scm-collector-2.0.5-SNAPSHOT.jar --spring.config.location=${APP_DIR}/dashboardApi.properties &
java -jar ${APP_DIR}/jenkins-build-collector-2.0.5-SNAPSHOT.jar --spring.config.location=${APP_DIR}/dashboardApi.properties &
/opt/gulpserve.sh &
