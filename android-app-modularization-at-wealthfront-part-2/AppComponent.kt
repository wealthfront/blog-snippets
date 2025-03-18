@Singleton
@Component(modules = [
  AppModule::class,
  ApiModule::class])
interface AppComponent {

  fun inject(wealthfrontApp: WealthfrontApp)

  fun inject(activity: MainActivity)

  val authComponentFactory: AuthComponent.Factory

  @Component.Factory
  interface Factory {
    fun create(appModule: AppModule): AppComponent
  }
}
