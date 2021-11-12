class User(username: String, password:String, userid: Int, groupid: Int,
           description: String, homeDirectory: String, shellToUse: String){

  override def toString: String = s"Username: $username, Password: $password, User ID: $userid " +
    s"Group ID: $groupid, Description: $description, Home Directory: $homeDirectory, Shell to use: $shellToUse "
}