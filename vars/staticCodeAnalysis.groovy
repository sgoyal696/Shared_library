def call(){
    withSonarQubeEnv(credentialsId : "sonarqube-id") {
        sh "mvn clean package sonar:sonar"
    }

}
