stage('Download code'){
    echo "Downloading the code";
}

stage('Testing') {
  git url: 'https://github.com/echarif/storeManager.git'
  def mvnHome = tool 'M3'
  sh "${mvnHome}/bin/mvn -B verify"
}
