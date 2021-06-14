package com.example.demo.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;
import org.togglz.core.manager.FeatureManager;
public enum Features implements Feature {

    @Label("Dummy Feature")
    FEATURE_DUMMY;

  public boolean isActive()
  {
      return FeatureContext.getFeatureManager().isActive(this);
  }

}
