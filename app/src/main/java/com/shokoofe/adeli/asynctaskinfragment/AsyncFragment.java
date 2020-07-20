package com.shokoofe.adeli.asynctaskinfragment;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;


public class AsyncFragment extends Fragment {
  private ParentActivity mParent;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    mParent = (ParentActivity)context;
    Log.i("AsyncFragment", "attached");
  }

  public void runAsyncTask(String ... params) {
    MyTask task = new MyTask(mParent);
    task.execute(params);
  }
}
