#!/bin/bash

# Test: adapting generate-one script to generate showcase module for testing
#cmd line:: ./generate-showcase.sh

WORKING_DIR=`pwd`

# get googleapis repo
git clone https://github.com/googleapis/googleapis.git

# fix googleapis committish for test/dev purpose
cd googleapis && git checkout f88ca86
# get gapic-showcase repo
cd .. && git clone https://github.com/googleapis/gapic-showcase.git
cd gapic-showcase && git checkout v0.25.0
# clone showcase repo and copy into googleapis
cd .. && mkdir googleapis/google/showcase
cp -r gapic-showcase/schema/google/showcase/v1beta1 googleapis/google/showcase/v1beta1

# Prepare `gapic-generator-java` with Spring generation ability.
# If keeping a copy in this repo, this is not needed.
# Checkout `gapic-generator-java`
git clone https://github.com/googleapis/gapic-generator-java.git
# get into gapic and checkout branch to use
cd gapic-generator-java
git checkout autoconfig-gen-draft2
# go back to googleapis folder
cd .. && cd googleapis

# In googleapis/WORKSPACE, find http_archive() rule with name = "gapic_generator_java",
# and replace with local_repository() rule
LOCAL_REPO="local_repository(\n    name = \\\"gapic_generator_java\\\",\n    path = \\\"..\/gapic-generator-java\/\\\",\n)"
perl -0777 -pi -e "s/http_archive\(\n    name \= \"gapic_generator_java\"(.*?)\)/$LOCAL_REPO/s" WORKSPACE

# todo(emmwang): modify existing BUILD.bazel? For now, this replaces showcase's BUILD.bazel file entirely
cp -rf "$WORKING_DIR"/resources/showcase-BUILD.bazel google/showcase/v1beta1/BUILD.bazel

# call bazel target - todo: separate target in future
bazel build //google/showcase/v1beta1:showcase_java_gapic

cd -

## copy spring code to outside
mkdir -p ../generated
cp googleapis/bazel-bin/google/showcase/v1beta1/showcase_java_gapic_srcjar-spring.srcjar ../generated

# unzip spring code
cd ../generated
# Move generated code alongside handwritten tests in showcase/src/test
unzip showcase_java_gapic_srcjar-spring.srcjar -d showcase/
rm -rf showcase_java_gapic_srcjar-spring.srcjar

# override versions & names in pom.xml
cat showcase/pom.xml

sed -i 's/{{client-library-group-id}}/com.google.showcase/' showcase/pom.xml
sed -i 's/{{client-library-artifact-id}}/google-showcase/' showcase/pom.xml
sed -i 's/{{client-library-version}}/0.25.0/' showcase/pom.xml
sed -i 's/{{starter-version}}/0.0.1-SNAPSHOT/' showcase/pom.xml

# remove downloaded repos
cd ../generator
rm -rf googleapis
rm -rf gapic-generator-java
rm -rf gapic-showcase