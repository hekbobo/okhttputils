package com.zhy.http.okhttp.callback;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public abstract class Callback<T>
{
    /**
     * UI Thread
     *
     * @param request
     */
    public void onBefore(Request request)
    {
    }

    /**
     * UI Thread
     *
     * @param
     */
    public void onAfter()
    {
    }

    /**
     * UI Thread
     *
     * @param progress
     */
    public void inProgress(float progress)
    {

    }
    /**
     * Thread Pool Thread
     *
     * @param response
     */
    public abstract T parseNetworkResponse(Response response) throws Exception;

    public abstract void onError(Request request, Exception e);

    public abstract void onResponse(T response);


    public static Callback CALLBACK_DEFAULT = new Callback()
    {

        @Override
        public Object parseNetworkResponse(Response response) throws Exception
        {
            return null;
        }

        @Override
        public void onError(Request request, Exception e)
        {

        }

        @Override
        public void onResponse(Object response)
        {

        }
    };

}