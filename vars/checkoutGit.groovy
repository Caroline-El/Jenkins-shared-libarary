def call(string gitUrl, string gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteconfigs: [[url: gitUrl]]
    ])
}