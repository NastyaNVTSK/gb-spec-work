import java.io.IOException;

public class Counter implements AutoCloseable {
    public Integer count = 0;
    private Boolean closed;

    Counter() {
        this.closed = false;
        this.count = 0;
    }

    public void add() throws Exception {

        if(this.isResourceClosed()) {
            throw new Exception("Ресурс был закрыт еще до того, чтобы вызвать метод add");
        }

        this.count++;
    }

    private boolean isResourceClosed() {
        return this.closed;
    }

    @Override
    public void close() throws IOException {
        this.closed = true;
    }
}
