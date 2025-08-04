def call(String repoUrl, String branch = 'master') {
    echo "Checking out repository: ${repoUrl} on branch: ${branch}"
    
    def checkoutConfig = [
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ]
    checkout(checkoutConfig)
    echo "Repository checkout completed successfully"    
}