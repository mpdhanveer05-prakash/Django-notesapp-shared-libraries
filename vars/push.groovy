def call(String ProjectName, String ImageTag, String dockerhubuser){
  echo "This is Pushing the image to docker hub"
  withCredentials([usernamePassword('credentialsId':"dockerhubcred", passwordVariable:"dockerhubpass", usernameVariable:"dockerhubuser")]){
    sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
}
