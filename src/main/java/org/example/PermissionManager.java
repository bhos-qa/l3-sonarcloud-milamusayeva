package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;
    public String getmCurrentLevelName() {
        return mCurrentLevel.name();
    }
    public void setmCurrentLevelName (PermissionLevel permissionLevel)
    {
        mCurrentLevel=permissionLevel;
    }
}
