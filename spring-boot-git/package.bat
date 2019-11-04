@echo off
echo Start to package project
set MAVEN_OPTS=-Xms128m -Xmx512m -Dfile.encoding=UTF-8
set codePath=%1
G:
echo %codePath%
cd %codePath%
call mvn clean
#call mvn package -Dmaven.test.skip=true --settings D:\\apache-maven-3.1.1\\conf\\settings-sdgh-v5.xml
call mvn deploy  --settings D:\\apache-maven-3.1.1\\conf\\settings-sdgh-v5.xml  -Dmaven.test.skip=true
exit