@Subcomponent
interface AuthComponent {

  @Subcomponent.Factory
  interface Factory {
    fun create(): AuthComponent
  }
  
  fun inject(loginScreen: LoginScreen)
}
