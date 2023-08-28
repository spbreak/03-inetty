package isun.nio.ch;

import ijava.nio.channels.spi.AbstractSelector;

import java.io.IOException;

public class WindowsSelectorProvider extends SelectorProviderImpl {
    public WindowsSelectorProvider() {
    }

    public AbstractSelector openSelector() throws IOException {
        return new WindowsSelectorImpl(this);
    }

    @Override
    public String toString() {
        return "i-自定义WindowsSelectorProvider";
    }
}
