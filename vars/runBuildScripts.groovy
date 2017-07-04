def call(bodyBlock) {
  
  def config = [
      test_script: './test',
  ]
  bodyBlock.resolveStrategy = Closure.DELEGATE_FIRST
  bodyBlock.delegate = config
  bodyBlock()
  final String myTests = config.test_script
  stages {
        stage('Run Tests') {
            steps {
              sh 'echo "Run Test Script"'
              println(myTests)
            }
        }
   }
}
