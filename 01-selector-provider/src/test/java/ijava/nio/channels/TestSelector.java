package ijava.nio.channels;

import ijava.nio.channels.spi.SelectorProvider;
import org.junit.Test;

import java.io.IOException;

public class TestSelector {
    
    @Test
    public void test() throws IOException {
        SelectorProvider provider = SelectorProvider.provider();
        System.out.println(provider);
        Selector unwrappedSelector = provider.openSelector();
        System.out.println(unwrappedSelector);
    }
}
