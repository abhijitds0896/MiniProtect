package com.example.hello.miniprotect;

/**
 * Created by Hello on 23-11-2017.
 */

public class Connection {
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    String fullname,location;
    int mob;
    Connection(String fullname,int mob,String location)
    {
        this.fullname=fullname;
        this.location=location;
        this.mob=mob;
    }


    public String getFullname() {
        return fullname;
    }

    public String getLocation() {
        return location;
    }

    public int getMob() {
        return mob;
    }
}
