echo Start to package project
MAVEN_OPTS=-Xms128m -Xmx512m -Dfile.encoding=UTF-8
codePath=$1
echo $codePath
cd $codePath
source mvn clean
#call mvn package -Dmaven.test.skip=true --settings /web/eln4data/automerge/maven/apache-maven-3.1.1/conf/settings.xml
source mvn deploy  --settings /web/eln4data/automerge/maven/apache-maven-3.1.1/conf/settings.xml  -Dmaven.test.skip=true
exit 0