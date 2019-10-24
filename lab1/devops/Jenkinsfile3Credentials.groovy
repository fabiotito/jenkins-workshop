
node{
    stage("init"){

    }
    stage("checkout"){
        withCredentials([string(credentialsId:"ftito-token",variable:'token1')]){
            echo "${token1}"

            tokentmp = token1.split('\\|')
            tok1 = tokentmp[0]
            tok1 = tokentmp[1]

            echo "${tok1} ---- ${tok2}"
        }

    }
    
}

/*
Tecsup00|fabiotito@gmail.com|textosecreto
*/