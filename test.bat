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

java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro READ -re a > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro READ -re a.b > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro QQQQ -re a.b > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro READ -re QQQQ > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro WRITE -re a > NUL
echo !!! %errorlevel%
java -cp "out\artifacts\softwareengineering\soft.jar" com.example.softwareengineering.Main -l jdoe -p sup3rpaZZ -ro WRITE -re a.b.c > NUL
echo !!! %errorlevel%