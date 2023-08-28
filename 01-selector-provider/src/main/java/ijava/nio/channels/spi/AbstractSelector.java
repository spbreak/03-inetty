package ijava.nio.channels.spi;

import ijava.nio.channels.Selector;

import java.io.IOException;

public abstract class AbstractSelector
        extends Selector {

    /**
     * Closes this selector.
     *
     * <p> If the selector has already been closed then this method returns
     * immediately.  Otherwise it marks the selector as closed and then invokes
     * the {@link #implCloseSelector implCloseSelector} method in order to
     * complete the close operation.  </p>
     *
     * @throws IOException
     *          If an I/O error occurs
     */
    public final void close() throws IOException {
        
    }
}
