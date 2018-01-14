package org.mozilla.focus.datasource;

import org.mozilla.focus.datasource.local.LocalNavigationDataSource;

/**
 * Created by tomliu on 2018/1/14.
 */

public class DatasourceFactory {

    public static NavigationDataSource getNavigatonDatasource() {
        return new LocalNavigationDataSource();
    }
}
