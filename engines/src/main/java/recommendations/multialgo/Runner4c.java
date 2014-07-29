package io.prediction.engines.java.recommendations.multialgo;

import io.prediction.controller.EmptyParams;
import io.prediction.controller.IEngineFactory;
import io.prediction.controller.java.JavaEngine;
import io.prediction.controller.java.JavaEngineBuilder;
import io.prediction.controller.java.JavaEngineParams;
import io.prediction.controller.java.JavaEngineParamsBuilder;
import io.prediction.controller.java.LJavaFirstServing;
import io.prediction.workflow.JavaAPIDebugWorkflow;

import java.util.HashMap;

import io.prediction.controller.IdentityPreparator;

public class Runner4c {
  public static void main(String[] args) {
    JavaEngineParams engineParams = new JavaEngineParamsBuilder()
      .dataSourceParams(new DataSourceParams("data/ml-100k/", true))
      // 1 -> -1., 2 -> -.5, 3 -> 0., 4 -> .5, 5 -> 1.
      .addAlgorithmParams("featurebased", new FeatureBasedAlgorithmParams(1.0, 5.0, 3.0, 0.5))
      .build();

    JavaAPIDebugWorkflow.runEngine(
      "Recommendation.multialgo",
      new HashMap<String, String>(),
      3, // verbose
      (new SingleEngineFactory()).apply(),
      engineParams
    );
  }
}


