def call(accesstoken,username) {
    sh '''
        sudo docker login -u username -p accesstoken
    '''
    echo "Authenctication successful"
}
