# This script will generate a plantuml poml file and then convert it into a png uml diagram
# The plantuml jar can be found at: https://plantuml.com/download
./gradlew clean compileJava generateClassDiagram
java -jar ./plantuml-1.2026.5.jar build/reports/structure.poml -tpng