node {  
    stage('git clone') { 
       git 'https://github.com/chetansomkuwar/Jenkins.git'
    }
    stage('Build') { 
       sh 'touch hhhhh.txt'
    }
    stage('test') { 
       sh 'echo hello mala zopu dya, dokyaa varun challa sab >> jindal.txt' 
    }
}