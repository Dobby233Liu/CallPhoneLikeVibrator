#!/bin/sh
gradle wrapper22
./gradlew build connectedCheck --scan
