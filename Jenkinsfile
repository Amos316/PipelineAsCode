pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Initial build started ....'
                sh ''' echo $PATH command '''
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