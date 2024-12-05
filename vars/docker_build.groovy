def call(String ImageName, String Imagetag, Sring DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ImageName}:${Imagetag}"
}
