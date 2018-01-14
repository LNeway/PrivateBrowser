package org.mozilla.focus.datasource;

import android.support.annotation.NonNull;

import org.mozilla.focus.activity.NavItem;

import java.util.List;

/**
 * Created by tomliu on 2018/1/14.
 */

public interface NavigationDataSource {

    interface NavItemCallback extends ICallback {
        void onNavItemRead(@NonNull List<NavItem> navItems);
    }
    void loadNavItem(NavItemCallback callback);

}
