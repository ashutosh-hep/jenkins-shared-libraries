def call(accesstoken, username) {
    // Use Groovy string interpolation to pass parameters into the shell command
    sh """
        echo ${accesstoken} | docker login -u ${username} --password-stdin
    """
    
    // Print confirmation message
    echo "Authentication successful"
}
