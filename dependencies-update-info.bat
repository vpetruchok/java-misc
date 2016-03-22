@echo off

gradle -b dependencies-update-info.gradle dependencyUpdates -Drevision=release %*
