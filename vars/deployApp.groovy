@Library('jenkins-groovy-shared-libs')_

pipeline{
    agent any
    stages{
        stage('Deploy'){
            steps{
                deployApp(
                    appname:'Java-Node-FSD-APP',
                    port:5000,
                    environment:'PRODUCTION'
                )
            }
        }
    }
}