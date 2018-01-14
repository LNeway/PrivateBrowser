package org.mozilla.focus.activity;

import java.io.Serializable;

/**
 * Created by tomliu on 2018/1/13.
 */

public class NavItem implements Serializable {

    public final String name;
    public final String url;
    public final String logo;

    public NavItem(String logo,  String name, String url) {
        this.logo = logo;
        this.name = name;
        this.url = url;
    }
}
