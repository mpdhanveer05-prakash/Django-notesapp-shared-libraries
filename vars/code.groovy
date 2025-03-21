def call(String url, string branch){
  echo "This is Cloning the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successful"
}
