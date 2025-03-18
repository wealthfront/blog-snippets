class LoginScreen : Screen<LoginView>, AuthenticationCallback {

  @Inject lateinit var authPortal: AuthPortal

  fun showBiometricConfirmation() {
    navigator.goTo(authPortal.getConfirmBiometricScreen("token", this))
  }
}
