def call(repoUrl, tag_name) {
    
    def checkoutConfig = [
        $class: 'GitSCM',
        branches: [
            [name: "refs/tags/${tag_name}"]
        ],
        userRemoteConfigs: [
            [url: '${repoUrl}']
        ]
    ]
    
    checkout(checkoutConfig)

}