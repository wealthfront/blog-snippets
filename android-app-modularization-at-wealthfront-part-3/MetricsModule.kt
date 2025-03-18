@Module
object MetricsModule {

  @Provides
  @Singleton
  @JvmStatic
  fun provideMetricsPublisher(
    @SingleThreaded api: DefaultApi,
    objectMapper: ObjectMapper,
    clock: Clock,
    overlay: Overlay
  ): MetricsPublisher {
    return MobileEventsMetricsPublisher(api, objectMapper, clock, overlay)
  }
}
