public class AsynchronousPublisher<T> implements Publisher<T> {

    private final ExecutorService pool;

    @Override
    public void subscribe(final Subscriber<? super T> subscriber) {
    }

    private static class SimpleCancellableSubscription extends AbstructCancellableSubscription {
        private final Subscriber<?> subscriber;
        public SimpleCancellableSubscription(final Subscriber<?> subscriber) {
            this.subscriber = subscriber;
        }
        @Override
        public List<Future<?>> publish(final long n) {
            if (n <= 0) {
                final Future<?> callOnError = pool.invoke(() -> {
                    this.subscriber.onError(new IllegalArgumentException("requested n: " + n);
                    return null;
                });
                return List.of(callOnError);
            } else {
                final List<Future<?>> handlers = new ArrayList();
            }
        }
    }

}