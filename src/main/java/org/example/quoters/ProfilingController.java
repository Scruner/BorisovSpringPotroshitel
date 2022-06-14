package org.example.quoters;

public class ProfilingController implements ProfilingControllerMBean{

  private boolean enable;

  public boolean isEnable() {
    return enable;
  }

  public void setEnabled(boolean enabled) {
    this.enable = enable;
  }
}
