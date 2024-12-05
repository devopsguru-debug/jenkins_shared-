def call(String Image, String Imagetag, String dockerhubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
                  sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
                  }
                  sh "docker push ${dockerhubUser}/${Image}:${Imagetag}"
                  }
                
                  
