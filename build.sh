#!/bin/bash

cd C:\Program Files (x86)\Jenkins\workspace\startup-demo-1

echo "run gradle clean"

./gradlew clean

echo "run gradle build"

./gradlew build

sleep 10