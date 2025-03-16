def call(accesstoken,username) {
    echo "${username}"
    echo "${accesstoken}"
    sh '''
        sudo docker login -u ${username} --password-stdin ${accesstoken}
    '''
    echo "Authenctication successful"
}
