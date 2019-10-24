
node{
    withEnv(["ENV_CLIENTID=1234-123"]){

        stage ("init"){
        echo "${ENV_CLIENTID}"
        sh 'printenv'
        cleanWs()
        }
  
    }

    stage("checkout"){
        println '====TODO===='
        
        sh "mkdir source"
        dir("source"){
        git(
            branch : "master",
            credentialsId: "ftito-github",
            url: "https://github.com/fabiotito/aks-rbac-example1.git"
        )
        }
        sh "pwd"
        
        sh "ls -lta && cd source && ls -lta"

    }
   
}