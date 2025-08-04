def call(String repoUrl, String branch = 'master') {
    echo "Checking out repository: ${repoUrl} on branch: ${branch}"
    
    def checkoutConfig = [
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ]

    def printCurrentDirectory() {
        String currentDir = System.getProperty("user.dir")
        println "Current Directory: ${currentDir}"
    }

    checkout(checkoutConfig)
    printCurrentDirectory()
    
}