public abstruct class AbstructCancellableSubscription implements Subscription {
    private final Queue<Future<?>> taskHandlers = new ConcurrentLinkedQueue<Future<?>>();
    protected Future<?> 
    @Override
    public void cancel() {
        Future<?> handler;
        while (null != (handler = taskHandler.poll()) {
            if (!handler.isDone()) {
                handler.cancel(true);
            }
        }
    }
    protected abstruct List<Future<?>> publish(final long n);
    @Override
    public void request(final long n) {
        this.taskHandlers.addAll(this.publish(n));
    }
}