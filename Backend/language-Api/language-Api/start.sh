#!/bin/bash
# Exit immediately if a command fails
set -e

echo "🚀 Building the Spring Boot application..."
./mvnw clean package -DskipTests || mvn clean package -DskipTests

echo "✅ Build complete. Starting the app..."

# Find the generated JAR file dynamically
JAR_FILE=$(find target -type f -name "*.jar" | head -n 1)

if [ -z "$JAR_FILE" ]; then
  echo "❌ No JAR file found in /target. Check your build output."
  exit 1
fi

echo "Running $JAR_FILE ..."
java -jar "$JAR_FILE"
