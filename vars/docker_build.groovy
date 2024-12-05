def call(String ImageName, String Imagetag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ImageName}:${Imagetag}"
}
