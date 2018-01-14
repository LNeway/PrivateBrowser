package org.mozilla.focus.datasource.local;

import org.mozilla.focus.activity.NavItem;
import org.mozilla.focus.datasource.NavigationDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomliu on 2018/1/14.
 */

public class LocalNavigationDataSource implements NavigationDataSource {

    @Override
    public void loadNavItem(NavItemCallback callback) {
        List<NavItem> datas = new ArrayList<>();
        datas.add(new NavItem("logo_baidu","百度", "https://www.baidu.com"));
        datas.add(new NavItem("logo_tencent","QQ", "http://www.qq.com"));
        datas.add(new NavItem("logo_163","网易", "http://www.163.com"));
        datas.add(new NavItem("logo_jd","京东", "https://www.jd.com"));
        datas.add(new NavItem("logo_tmall","天猫", "https://www.tmall.com"));
        datas.add(new NavItem("logo_github","GitHub", "https://www.github.com"));
        datas.add(new NavItem("logo_google", "Google", "https://www.google.com"));
        datas.add(new NavItem("logo_sina","新浪", "https://www.sina.com"));
        if (callback != null) {
            callback.onNavItemRead(datas);
        }
    }
}
