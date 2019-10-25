
node{
    //docker pull hashicorp/terraform:0.12.12

    stage("init"){

    }
    stage("checkout"){
        withCredentials([string(credentialsId:"ftito-token",variable:'token1')]){
            
            echo "${token1}"

            tokentmp = token1.split('\\|')
            tok1 = tokentmp[0]
            tok2 = tokentmp[1]

            echo "${tok1} ---- ${tok2}"
        }

    }

// terraform init
// terraform apply
// terraform -version
// docker run -it <name image>:tag
// docker pull docker pull hashicorp/terraform:0.12.12
    stage("deploy"){
        docker.image("docker pull hashicorp/terraform:0.12.12").withRun("-version"){
            container -> sh "docker logs ${container.id}"
        }
    }
}
