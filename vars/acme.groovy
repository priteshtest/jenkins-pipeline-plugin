def call(bodyBlock) {
  
  def config = [
      test_script: './test'
  ]
  stage('Run Tedt checks') {
      sh "Run Test Script"
  }
}
