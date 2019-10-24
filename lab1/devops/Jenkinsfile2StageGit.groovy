
node{
    withEnv(["ENV_CLIENTID=1234-123"]){

        stage ("init"){
            echo "${ENV_CLIENT}"

        }

    }

    stage("checkout"){
        println 'TODO'
    }
   
}