public interface MetricsPublisher {

  void publishEvent(Screen screen, String name);

  void publishEvent(String category, String name);

  void publishEventWithPayload(Screen screen, String name, Object payload);

  void publishEventWithPayload(String category, String name, Object payload);

  void startSession();

  void endSession();

  String getSessionId();

  void publishEventsToApi();
}
