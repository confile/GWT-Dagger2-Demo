package test.client.test2;

import dagger.Component;


@Component(modules = MyWidgetClientModule.class)
public interface MyWidgetGinjector {

  SomeService getSomeService();
  
}
