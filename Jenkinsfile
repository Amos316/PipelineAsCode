pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
               echo 'Initial build started ....'
               sh '''  
                     echo "PATH = ${PATH}"
                     echo "M2_HOME = /usr/local/Cellar/maven/3.6.0/libexec "            
                  '''
               sh 'mvn clean package'
           }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
}