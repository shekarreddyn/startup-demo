#!/bin/bash

echo "run gradle clean"

./gradlew clean

echo "run gradle build"

./gradlew build

sleep 10