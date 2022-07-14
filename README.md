!/bin/bash
sudo -i
sudo apt update -y
sudo apt install openjdk-11-jre-headless -y
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt install jenkins -y
sudo systemctl start jenkins
sudo systemctl enable jenkins

pipeline-types:-

.jdp & .groovy script are works

      Code (Visual Studio Code) ---Push --> GitHub---<--Jenkins (Build+Test) = CI [AWS Ec2 Instance]
