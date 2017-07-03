def call(String dockerImg) {
    stage('building docker image :'+dockerImg) {
        //sh 'echo "docker build -t ${dockerImg}" '
        println(env.DOCKER_IMAGE)
    }
}
