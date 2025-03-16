def call(accesstoken,username) {
    sh '''
        sudo docker login -username ${username} --password-stdin ${accesstoken}
    '''
    echo "Authenctication successful"
}
