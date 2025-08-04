def call(String repoUrl) {
    echo "Checking out repository: ${repoUrl} on branch: ${params.TAG}"
    
    checkoutConfig = [
        [$class: 'GitSCM',
        branches: [[name: "refs/tags/${params.TAG}"]],
        userRemoteConfigs: [[url: 'https://github.com/jenkinsci/git-parameter-plugin.git']]]
    ]
    checkout(checkoutConfig)
    echo "Repository checkout completed successfully" 
}