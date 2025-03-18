@Module
abstract class NavigationPortalModule {

  @Binds
  abstract fun provideAuthPortal(authPortal: AuthPortalImpl): AuthPortal
}
