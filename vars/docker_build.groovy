def call(String Image, String Imagetag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${Image}:${Imagetag} ."
}
