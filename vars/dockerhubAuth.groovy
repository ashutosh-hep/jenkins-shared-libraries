def call(accesstoken,username) {
    sudo docker login -u username -p accesstoken
    echo "Authenctication successful"
}
