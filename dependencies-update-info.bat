@echo off

gradlew.bat -b dependencies-update-info.gradle dependencyUpdates -Drevision=release %*
