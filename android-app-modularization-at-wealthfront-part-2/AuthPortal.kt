interface AuthPortal {

  fun getLoginScreen(): Screen<*>

  fun getAuthenticateBiometricScreen(): Screen<*>

  fun getConfirmBiometricScreen(
    accessToken: String,
    authenticationCallback: AuthenticationCallback
  ): Screen<*>
}
