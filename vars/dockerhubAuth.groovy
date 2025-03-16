def call(accesstoken,username) {
    sh '''
        sudo docker login -u ${username} --password-stdin ${accesstoken}
    '''
    echo "Authenctication successful"
}
