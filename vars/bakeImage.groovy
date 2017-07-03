def call(String dockerImg) {
    stage('building docker image :'+dockerImg) {
        sh "docker build -t ${dockerImg} ."
        println(DOCKER_IMAGE)
    }
}
