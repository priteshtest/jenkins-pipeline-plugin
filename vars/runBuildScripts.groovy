def call(bodyBlock) {
  
  def config = [
      test_script: './test'
  ]
  stage('Run Tests') {
      sh 'echo "Run Test Script"'
  }
}
