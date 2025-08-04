def call(String repoUrl, String TAG = "${params.TAG}") {
    
    def checkoutConfig = [
        [$class: 'GitSCM',
        branches: [[name: "refs/tags/${TAG}"]],
        userRemoteConfigs: [[url: 'https://github.com/jenkinsci/git-parameter-plugin.git']]]
    ]
    checkout(checkoutConfig)

}