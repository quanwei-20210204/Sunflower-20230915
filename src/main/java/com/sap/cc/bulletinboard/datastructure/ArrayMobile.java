package com.sap.cc.bulletinboard.datastructure;

public class ArrayMobile {
    User[] _users;

    public ArrayMobile(User[] _users) {
        this._users = _users;
    }

    public ArrayMobile(){

    }
    public void LoggedInUserArray(){
        User[] users = new User[0];
        _users = users;
    }


}
