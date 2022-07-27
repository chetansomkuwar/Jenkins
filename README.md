pipeline-types:-

.jdp & .groovy script are works

      Code (Visual Studio Code) ---Push --> GitHub---<--Jenkins (Build+Test) = CI [AWS Ec2 Instance]
      
      
############################ Backup of pipeline ##################################


This all practical going in java version 8.

1. Create ec2 instance with port (22, 8080) & get ssh into moba.

2. install jenkins with version java version 9

 sudo apt update -y
 sudo apt-get install openjdk-8-jdk -y
 wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
 sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
 sudo apt update -y
 sudo apt install jenkins -y
 sudo systemctl start jenkins
 sudo systemctl start jenkins

3. Configured jenkins
	- create a Username & Password
	- Install Required Pluggins
		- ssh
		- ssh Build Agent
		- pipeline
		- pipeline graph anaylsis
		- pipeline stage view
		- Seed Jenkins

4. Create a Pipeline

5. if, you don't forked repository, so forked it for getting backup configuration

	https://github.com/chetansomkuwar/jenkinsxml2jobdsl

6. Now, clone and get backup of our pipeline.

	 git clone https://github.com/chetansomkuwar/jenkinsxml2jobdsl
	 cd jenkinsxml2jobdsl
	 ./gradlew build
	 java -jar build/libs/jenkinsxml2jobdsl.jar -u <usernane> -a <password> -j <public_IP> -p 8080 <job_name>
	 cd jobs
	 cat <pipeline_name>.groovy

