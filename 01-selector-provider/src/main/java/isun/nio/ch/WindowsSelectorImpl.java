package isun.nio.ch;

import ijava.nio.channels.spi.SelectorProvider;

public class WindowsSelectorImpl extends SelectorImpl {

    WindowsSelectorImpl(SelectorProvider var1) {
    }

    @Override
    public String toString() {
        return "i-自定义" + getClass().getName();
    }
}
