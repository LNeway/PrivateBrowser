package org.mozilla.focus.datasource;

/**
 * Created by tomliu on 2018/1/14.
 */

public interface ICallback {

    void onError(int requestId, int errorCode);
}
