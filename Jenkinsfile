#!groovy
import static Constants.*

class Constants {

    static final DEV_BRANCH_NAME = "develop"
    static final MASTER_BRANCH_NAME = "master"
}

def downloadCodeAndBuild() {
    stage('Download code') {
        deleteDir()
        git branch: env.BRANCH_NAME, credentialsId: 'echarif', url: 'https://github.com/echarif/storeManager.git'
    }

    stage('Build and test code') {
        try {
            sh "mvn clean install"
        } catch (e) {
        }
    }
}
