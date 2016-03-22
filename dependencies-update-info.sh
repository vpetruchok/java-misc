#!/bin/sh

./gradlew -b dependencies-update-info.gradle dependencyUpdates -Drevision=release "$@"
