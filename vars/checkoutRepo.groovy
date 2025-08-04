def checkoutRepoWithTag(repoUrl, tag_name) {
    
    def checkoutConfig = [
        $class: 'GitSCM',
        branches: [
            [name: "refs/tags/${tag_name}"]
        ],
        userRemoteConfigs: [
            [url: 'https://github.com/jenkinsci/git-parameter-plugin.git']
        ]
    ]
    
    checkout(checkoutConfig)
    return true

}