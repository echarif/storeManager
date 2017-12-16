pipeline {
  agent { docker 'ruby:2.1' }
  stages {
    stage('build') {
      steps {
        sh 'ruby --version'
        sh 'bundle install'
      }
    }
  }
}
