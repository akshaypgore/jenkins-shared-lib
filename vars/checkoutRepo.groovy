def call(String repoUrl) {
    echo "Checking out repository: ${repoUrl} on branch: ${branch}"
    
    checkout(
        [$class: 'GitSCM',
        branches: [[name: "${params.TAG}"]],
        userRemoteConfigs: [[url: 'https://github.com/jenkinsci/git-parameter-plugin.git']]]
        )
    echo "Repository checkout completed successfully" 
}