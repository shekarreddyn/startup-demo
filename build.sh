#!/bin/bash

cd C:\Program Files (x86)\Jenkins\workspace\startup-demo-1

sleep 2

echo "run gradle clean"

sleep 2

$./gradlew clean

echo "run gradle build"

sleep 2

$./gradlew build

sleep 10