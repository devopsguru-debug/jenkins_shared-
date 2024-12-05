def call(String Image, String Imagetag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
                  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                  }
                  sh "docker push ${dockerHubUser}/${Image}:${Imagetag}"
                  }
                
                  
