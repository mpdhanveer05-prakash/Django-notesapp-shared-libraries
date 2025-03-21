def call(String ProjectName, String ImageTag, String dockerhubuser){
  echo "This is Building the code"
  sh "docker build -t ${dockerhubuser}/${ProjectName}:${ImageTag} ."
  echo "Image build successful"
}
