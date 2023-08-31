def call(string Project, string ImageTag, string HubUser){

    sh """
    docker image build -t ${HubUser}/${Project} .
    docker image tag ${HubUser}/${Project} ${HubUser}/${Project}: ${ImageTag}  
     docker image tag ${HubUser}/${Project}: latest
    """
}