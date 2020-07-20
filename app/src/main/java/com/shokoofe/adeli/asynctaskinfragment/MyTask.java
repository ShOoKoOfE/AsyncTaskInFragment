package com.shokoofe.adeli.asynctaskinfragment;

import android.os.AsyncTask;

public class MyTask extends AsyncTask<String, String, Void> {
  private ParentActivity mParent;
  public MyTask(ParentActivity mParent) {
    this.mParent = mParent;
  }
  @Override
  protected Void doInBackground(String... params) {
    for (String s : params) {
      publishProgress("I got " + s);
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  protected void onProgressUpdate(String... values) {
    mParent.handleTaskUpdate(values[0]);
  }
}