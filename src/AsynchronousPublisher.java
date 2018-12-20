public class AsynchronousPublisher<T> implements Publisher<T> {

    private final ExecutorService pool;

    @Override
    public void subscribe(final Subscriber<? super T> subscriber) {
    }

}