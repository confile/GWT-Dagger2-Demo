package test.client.test2;

import dagger.Module;
import dagger.Provides;

@Module
public class MyWidgetClientModule {

  @Provides
  SomeService provideSomeService() {
    return new SomeServiceImpl();
  }
  
}
