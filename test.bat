@echo off
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -h > NUL
echo !!! %errorlevel%

java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l QQQQ -p QQQQ > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p QQQQ > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ > NUL
echo !!! %errorlevel%