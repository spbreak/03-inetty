package ijava.nio.channels;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.ClosedSelectorException;

public abstract class Selector implements Closeable {

    /**
     * Closes this selector.
     *
     * <p> If a thread is currently blocked in one of this selector's selection
     * methods then it is interrupted as if by invoking the selector's {@link
     * #wakeup wakeup} method.
     *
     * <p> Any uncancelled keys still associated with this selector are
     * invalidated, their channels are deregistered, and any other resources
     * associated with this selector are released.
     *
     * <p> If this selector is already closed then invoking this method has no
     * effect.
     *
     * <p> After a selector is closed, any further attempt to use it, except by
     * invoking this method or the {@link #wakeup wakeup} method, will cause a
     * {@link ClosedSelectorException} to be thrown. </p>
     *
     * @throws IOException
     *          If an I/O error occurs
     */
    public abstract void close() throws IOException;
}
