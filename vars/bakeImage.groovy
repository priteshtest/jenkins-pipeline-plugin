def call(String dockerImg) {
    stage('building docker image :'+dockerImg) {
        //sh 'echo "docker build -t ${dockerImg}" '
        println(DOCKER_IMAGE)
    }
}
