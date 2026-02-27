package org.example.Utils;

import org.example.Model.UserData;

import java.io.IOException;

public class CredentialsReader {

    private static final String pathToUserData = "credentials.json";
    private static UserData userData;

    public static UserData getUserData() throws IOException {
        if(userData == null){
            String userDataFilePath = PathManager.getPath(pathToUserData);
            userData = JsoParser.parse(userDataFilePath, UserData.class);
        }
        return userData;
    }
}
