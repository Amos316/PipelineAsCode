pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
               echo 'Initial build started ....'
               sh '''  
                    echo "PATH = ${PATH}
                    echo "M2_HOME = ${M2_HOME}"            
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