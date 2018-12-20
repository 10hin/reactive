public abstruct class AbstructCancellableSubscription implements Subscription {
    private final Queue<Future<?>> taskHandlers = new ConcurrentLinkedQueue<Future<?>>();
    protected Future<?> 
    @Override
    public void cancel() {
        
    }
}