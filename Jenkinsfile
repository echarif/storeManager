#!groovy
import static Constants.*

class Constants {

    static final DEV_BRANCH_NAME = "develop"
    static final MASTER_BRANCH_NAME = "master"
}

def isFeatureBranch() {
  return DEV_BRANCH_NAME != env.BRANCH_NAME && MASTER_BRANCH_NAME != env.BRANCH_NAME
}

def lastLocalCommitHash() {
    echo("INFO: env.GIT_REVISION is: " + env.GIT_REVISION)
    if (env.GIT_REVISION == null) {
        env.GIT_REVISION = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
    }
    return env.GIT_REVISION
}

def downloadCodeAndBuild() {
    stage('Download code') {
        deleteDir()
        git branch: env.BRANCH_NAME, credentialsId: 'echarif', url: 'https://github.com/echarif/storeManager.git'
        env.COMMIT_HASH = lastLocalCommitHash()
    }

    stage('Build and test code') {
        try {
            sh "mvn clean install"
        } catch (e) {
        }
    }
}
