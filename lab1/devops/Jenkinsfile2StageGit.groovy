
node{
    withEnv(["ENV_CLIENTID=1234-123"]){

        stage ("init"){
            echo "${ENV_CLIENTID}"
sh 'printenv'
        }
  
    }

    stage("checkout"){
        println '====TODO===='

        git(
            branch : "master",
            credentialsId: "ftito-github",
            url: "https://github.com/fabiotito/aks-rbac-example1.git"
        )

        sh "ls -lta"

    }
   
}