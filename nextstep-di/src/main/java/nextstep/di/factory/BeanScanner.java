package nextstep.di.factory;

import java.util.Set;

public interface BeanScanner {
    Set<BeanDefinition> doScan();
}
