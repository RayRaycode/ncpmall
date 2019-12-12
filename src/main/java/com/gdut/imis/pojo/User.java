package com.gdut.imis.pojo;

public class User {
    private Integer id;

    private String NAME;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAnonymousName(){
        if(null==NAME)
            return null;

        if(NAME.length()<=1)
            return "*";

        if(NAME.length()==2)
            return NAME.substring(0,1) +"*";

        char[] cs =NAME.toCharArray();
        for (int i = 1; i < cs.length-1; i++) {
            cs[i]='*';
        }
        return new String(cs);

    }
}