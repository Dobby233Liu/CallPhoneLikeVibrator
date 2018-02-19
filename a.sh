#!/bin/bash
 gradle wrapper22
 ./gradlew build connectedCheck --scan --info --debug --stacktrace
